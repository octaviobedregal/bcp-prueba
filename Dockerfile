FROM openjdk:11-jdk-slim
COPY "./target/tipocambio-0.0.1-SNAPSHOT.jar" "tipocambio.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","tipocambio.jar"]