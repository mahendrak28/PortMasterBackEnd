From openjdk:latest
VOLUME /tmp
EXPOSE 9010
ADD ./target/portmaster-0.0.1-SNAPSHOT.jar portmaster-0.0.1-SNAPSHOT.jar
ENTRYPOINT  ["java","-jar","portmaster-0.0.1-SNAPSHOT.jar"]
