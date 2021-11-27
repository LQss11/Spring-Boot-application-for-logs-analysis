# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring-boot-app
WORKDIR /spring-boot-app/app-content

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /spring-boot-app/app-content/target

# running the spring boot app
CMD ["java", "-jar", "elk-logs-swagger-restful-api-1.0.jar"]

