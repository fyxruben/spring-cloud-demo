#!/usr/bin/env bash

mvn clean package spring-boot:repackage -Dmaven.test.skip

docker build . -t spring-demo-eureka
