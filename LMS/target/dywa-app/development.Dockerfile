FROM jboss/wildfly:14.0.1.Final as wildfly-dime

# Switching to user root to avoid permission failures
USER root

# Set system wide locale
RUN yum -y update glibc-common
RUN localedef -i en_US -f UTF-8 en_US.UTF-8
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

# Locations of dependencies
ENV POSTGRESDRIVER_JAR_FILE postgresql-42.2.2.jar
ENV POSTGRESDRIVER_JAR_URL https://jdbc.postgresql.org/download/$POSTGRESDRIVER_JAR_FILE

# Wildfly path configuration
ENV WILDFLY_HOME_PATH /opt/jboss/wildfly
ENV WILDFLY_BIN_PATH $WILDFLY_HOME_PATH/bin
ENV WILDFLY_CONFIGURATION_PATH $WILDFLY_HOME_PATH/standalone/configuration
ENV WILDFLY_DATA_PATH $WILDFLY_HOME_PATH/standalone/data
ENV WILDFLY_FILES_PATH $WILDFLY_DATA_PATH/files
ENV WILDFLY_POSTGRES_MODULE_PATH $WILDFLY_HOME_PATH/modules/system/layers/base/org/postgresql/main/

# Configure Wildfly
COPY --chown=jboss:jboss docker/standalone.xml $WILDFLY_CONFIGURATION_PATH/
COPY --chown=jboss:jboss docker/standalone.conf $WILDFLY_BIN_PATH/

# Installation of PostgreSQL-driver
RUN mkdir -p $WILDFLY_POSTGRES_MODULE_PATH && \
    curl --output $WILDFLY_POSTGRES_MODULE_PATH$POSTGRESDRIVER_JAR_FILE $POSTGRESDRIVER_JAR_URL && \
    chown -R jboss:jboss $WILDFLY_POSTGRES_MODULE_PATH$POSTGRESDRIVER_JAR_FILE
COPY --chown=jboss:jboss docker/module.xml $WILDFLY_POSTGRES_MODULE_PATH/module.xml

# Apply directory changes to enable volume binding
RUN mkdir -p $WILDFLY_FILES_PATH && chown -R jboss:jboss $WILDFLY_DATA_PATH

FROM maven:3.8.1-jdk-8 as maven
WORKDIR /app
# Create the module structure and copy
# containing pom.xml files seperated from
# the source code to utilize caching mechanism of Docker.
COPY app-addon app-addon
COPY app-business/pom.xml app-business/
COPY app-ear/pom.xml app-ear/
COPY app-persistence-api/pom.xml app-persistence-api/
COPY app-persistence-impl/pom.xml app-persistence-impl/
COPY app-presentation/pom.xml app-presentation/
COPY app-util/pom.xml app-util/
COPY pom.xml .
COPY xadisk/pom.xml xadisk/
# This plugin resolves and downloads all known depenendies.
# If this step is correctly configured, it should be cached by Docker
# after the first successfull run.
RUN mvn de.qaware.maven:go-offline-maven-plugin:resolve-dependencies
COPY . .
# If the caching mechanism of Docker is correctly used,
# the following step just builds the software without
# resolving further depenencies.
RUN mvn install

FROM wildfly-dime
ENV WILDFLY_DEPLOYMENTS_PATH $WILDFLY_HOME_PATH/standalone/deployments
COPY --from=maven --chown=jboss:jboss /app/app-ear/target/app-1.0-SNAPSHOT.ear $WILDFLY_DEPLOYMENTS_PATH/
# Switching to user jboss
USER jboss
