# Base image with JDK
FROM amazoncorretto:21-alpine-jdk as build

# Install Maven
RUN apk add --no-cache maven

# Copy your source code into the image
WORKDIR /app
COPY pom.xml .
COPY src src

# Build the application
RUN mvn clean package -DskipTests

# Final base image
FROM amazoncorretto:21-alpine-jdk
WORKDIR /app

# Copy the built jar file
COPY --from=build /app/target/*.jar jobapp.jar

ENTRYPOINT ["java", "-jar", "jobapp.jar"]
