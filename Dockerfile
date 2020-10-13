FROM adoptopenjdk/openjdk11:alpine-jre


ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar

WORKDIR /opt/app


COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java","-jar","app.jar"]