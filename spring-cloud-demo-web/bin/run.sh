#!/usr/bin/env bash

docker stop spring-demo-web
docker rm spring-demo-web
docker run --name spring-demo-web \
 -p 8766:8080 \
 --link spring-demo-eureka:EUREKA \
 -d spring-demo-web
