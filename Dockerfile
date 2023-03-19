FROM openjdk:11
COPY ./target/maven-demo-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "maven-demo-1.0-SNAPSHOT-jar-with-dependencies.jar"]