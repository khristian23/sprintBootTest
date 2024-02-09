FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar springBootTest.jar
ENTRYPOINT ["java","-jar","/springBootTest.jar"]
EXPOSE 8080
