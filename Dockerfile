FROM openjdk:8-alpine

COPY target/uberjar/task-cabinet-clj.jar /task-cabinet-clj/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/task-cabinet-clj/app.jar"]
