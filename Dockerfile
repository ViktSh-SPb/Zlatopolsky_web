FROM openjdk:17
LABEL authors="Viktor"
WORKDIR /app
COPY target/Zlatopolsky_web-0.0.1-SNAPSHOT.jar /app/Zlatopolsky_web-0.0.1-SNAPSHOT.jar
EXPOSE 10000/TCP
CMD ["java", "-jar", "Zlatopolsky_web-0.0.1-SNAPSHOT.jar"]