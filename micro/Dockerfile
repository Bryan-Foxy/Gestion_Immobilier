FROM openjdk:8
EXPOSE 8090
ADD /target/micro-0.0.1-SNAPSHOT.jar micro.jar
ENTRYPOINT ["java",  "-jar", "/micro.jar"]