FROM amazoncorretto:21-alpine-jdk
COPY target/jobapp.jar jobapp.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "jobapp.jar" ]