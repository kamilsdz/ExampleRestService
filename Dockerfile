FROM openjdk:14-jdk-alpine
ADD . app/
WORKDIR app/
RUN ./mvnw compile
