FROM nginx:1.17.2
COPY nginx.conf /etc/nginx/
COPY build /usr/share/nginx/html
