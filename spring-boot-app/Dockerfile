# Base Image ubuntu
FROM maven:3.8.4-openjdk-8-slim

# coping the required application files
COPY . /spring-boot-app
WORKDIR /spring-boot-app/app-content

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /spring-boot-app/app-content/target

# running the spring boot app
CMD ["java", "-jar", "elk-logs-swagger-restful-api-1.0.jar"]

