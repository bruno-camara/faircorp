FROM openjdk:11
RUN addgroup --system spring && adduser --system spring
USER spring:spring
ARG JAR_FILE=build/libs/faircorp-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080
ENV APP_PORT "8080"
ENV H2_USERNAME "USERNAME"
ENV H2_PASSWORD "PASSWORD"
ENV H2_FOLDER "FOLDER"

ENTRYPOINT ["java","-jar","/app.jar"]