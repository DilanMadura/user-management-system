FROM openjdk:17-jdk-alpine
EXPOSE 8081
ADD target/user-management-system-docker.jar user-management-system-docker.jar
ENTRYPOINT ["java","-jar","/user-management-system-docker.jar"]
