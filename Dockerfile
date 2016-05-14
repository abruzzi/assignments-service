FROM java:8

COPY build/libs/assignment-service-0.0.1-SNAPSHOT.jar /app/assignment-service.jar
EXPOSE 9797

ENTRYPOINT ["java", "-Dserver.port=9797", "-Dspring.profiles.active=production", "-Dspring.data.mongodb.uri=mongodb://127.0.0.1:27017/operation", "-jar","/app/assignment-service.jar"]
