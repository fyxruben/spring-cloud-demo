#!/usr/bin/env bash

mvn clean package spring-boot:repackage -Dmaven.test.skip
if [ $? -ne 0 ]; then echo '编译失败!!!!!'; exit 1; fi

docker build . -t spring-demo-provider
