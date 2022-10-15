FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /target/get-message-0.0.1-SNAPSHOT.jar get-message-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "get-message-0.0.1-SNAPSHOT.jar" ]