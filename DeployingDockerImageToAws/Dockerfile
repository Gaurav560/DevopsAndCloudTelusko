FROM amazoncorretto:21-alpine-jdk
COPY target/deployjobapp.jar deployjobapp.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "deployjobapp.jar" ]