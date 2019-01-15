#!/usr/bin/env bash

cd ..
#mvn clean install -Dmaven.test.skip
mvn clean install -pl spring-cloud-demo-api -am
if [ $? -ne 0 ]; then echo '编译失败!!!!!'; exit 1; fi
