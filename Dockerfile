From openjdk:8
copy ./target/portmaster-0.0.1-SNAPSHOT.jar portmaster-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","portmaster-0.0.1-SNAPSHOT.jar"]
