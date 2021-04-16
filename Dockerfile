FROM openjdk:8-jdk-alpine
COPY target/app-*.jar app.jar
COPY src/main/resources/* .
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 9080