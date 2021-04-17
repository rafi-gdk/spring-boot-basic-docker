FROM openjdk:8-jdk-alpine
EXPOSE 8282
ARG JAR_FILE=target/spring-boot-basic-docker.war
ADD ${JAR_FILE} spring-boot-basic-docker-docker.war
ENTRYPOINT ["java","-jar","/spring-boot-basic-docker.war"]