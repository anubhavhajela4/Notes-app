FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Notes.jar Notes.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Notes.jar"]