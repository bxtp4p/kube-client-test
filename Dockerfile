FROM openjdk:8-jre-alpine

COPY target/kube-client-test-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/app.jar

WORKDIR /app

CMD ["java", "-jar", "app.jar"]