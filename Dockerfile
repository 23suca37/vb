
# Java image
FROM openjdk:17-jdk-slim

# app folder
WORKDIR /app

# copy jar file
COPY target/*.jar app.jar

# expose port
EXPOSE 8080

# run application
ENTRYPOINT ["java","-jar","app.jar"]