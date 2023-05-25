FROM maven:3.6.0-jdk-11-slim AS build
COPY src /usr/src/ng-sarc-app/src
COPY pom.xml /usr/src/ng-sarc-app
RUN mvn -f /usr/src/ng-sarc-app clean package

FROM openjdk:11
COPY --from=build /usr/src/ng-sarc-app/target/ng-sarc-0.0.1-SNAPSHOT.jar /usr/src/ng-sarc-demo/ng-sarc-0.0.1-SNAPSHOT.jar

COPY . .
EXPOSE 8082
CMD ["java", "-jar", "/usr/src/ng-sarc-demo/ng-sarc-0.0.1-SNAPSHOT.jar"]