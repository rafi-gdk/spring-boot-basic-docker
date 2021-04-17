FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-basic-docker.jar
ADD ${JAR_FILE} spring-boot-basic-docker-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-basic-docker.jar"]