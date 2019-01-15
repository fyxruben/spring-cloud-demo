#!/usr/bin/env bash

docker stop spring-demo-eureka
docker rm spring-demo-eureka
docker run --name spring-demo-eureka \
 -p 8765:8080 \
 --hostname=EUREKA \
 -d spring-demo-eureka
