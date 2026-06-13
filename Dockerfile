FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/project-ci-cd.jar project-ci-cd.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "project-ci-cd.jar"]