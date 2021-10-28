#Image that we are using
FROM openjdk:11
ADD target/weathermongo-1.0-SNAPSHOT.jar weathermongo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "weathermongo.jar"]