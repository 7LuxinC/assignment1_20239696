FROM google/dart:2.10.5 AS builder
RUN pub global activate webdev 2.6.2
WORKDIR /app
COPY ./pubspec.* /app/
RUN pub get
COPY . /app/
RUN /root/.pub-cache/bin/webdev build

FROM nginx:1.17.2
COPY nginx.conf /etc/nginx/
COPY --from=builder /app/build /usr/share/nginx/html
