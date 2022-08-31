FROM openjdk:11
EXPOSE 8000
ADD target/devops-int.jar devops-int.jar
ENTRYPOINT ["java","-jar","/devops-int.jar"]