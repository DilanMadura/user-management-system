FROM openjdk:17-jdk-alpine
EXPOSE 8081
ADD target/user-management-system.jar user-management-system.jar
ENTRYPOINT ["java","-jar","/user-management-system.jar"]
