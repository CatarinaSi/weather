#Image that we are using
FROM openjdk:11
ADD target/weathersql-0.0.1-SNAPSHOT.jar weathersql.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "weathersql.jar"]