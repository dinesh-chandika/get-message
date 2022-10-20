FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /target/get-message.jar get-message.jar
ENTRYPOINT [ "java", "-jar", "get-message.jar" ]