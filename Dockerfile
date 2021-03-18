FROM openjdk:11
ADD target/demo-spring.jar demo-spring.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "demo-spring.jar"]