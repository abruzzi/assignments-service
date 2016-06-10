FROM java:8

ADD build/libs/assignment-service-1.0.0.jar /app/assignment-service.jar
EXPOSE 9797

ENTRYPOINT ["java", "-jar","/app/assignment-service.jar"]