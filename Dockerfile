FROM openjdk:8
WORKDIR /app
EXPOSE 8080
COPY /target/achat-1.0.jar /achat-1.0.jar
ENTRYPOINT ["java", "-jar", "/achat-1.0.jar"]
