FROM openjdk:11
WORKDIR /usr/src/ng-sarc-app
COPY ./target/ng-sarc-0.0.1-SNAPSHOT.jar ./

COPY . .
EXPOSE 8082
CMD ["java", "-jar", "ng-sarc-0.0.1-SNAPSHOT.jar"]