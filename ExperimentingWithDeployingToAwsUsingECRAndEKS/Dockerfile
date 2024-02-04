FROM amazoncorretto:21-alpine-jdk
COPY target/experimentjobapp.jar experimentjobapp.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "experimentjobapp.jar" ]