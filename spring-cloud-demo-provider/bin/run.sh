#!/usr/bin/env bash

docker stop spring-demo-provider
docker rm spring-demo-provider
docker run --name spring-demo-provider \
 -p 8767:8080 \
 --link spring-demo-eureka:EUREKA \
 -d spring-demo-provider
