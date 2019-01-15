#!/usr/bin/env bash

docker stop spring-demo-eureka
docker rm spring-demo-eureka
docker run --name spring-demo-eureka \
 -p 8765:8765 \
 -d spring-demo-eureka
