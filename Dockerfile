FROM openjdk:8-alpine

COPY target/uberjar/clojure-app.jar /clojure-app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure-app/app.jar"]
