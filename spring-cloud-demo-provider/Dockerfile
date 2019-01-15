FROM anapsix/alpine-java:8_jdk
RUN echo "Asia/shanghai" > /etc/timezone;
VOLUME ["/tmp"]
COPY target/spring-cloud-demo-provider-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
