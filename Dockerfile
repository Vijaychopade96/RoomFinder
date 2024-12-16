


FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/RoomFinder-0.0.1-SNAPSHOT.jar RoomFinder.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "RoomFinder.jar"]
