FROM openjdk:8-jdk-alpine
COPY /home/vsts/work/1/s/target/app-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080