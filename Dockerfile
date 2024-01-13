FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar ./school.jar
EXPOSE 8080
ENV SPRING_PROFILES_ACTIVE local
ENTRYPOINT ["java", "-jar","school.jar"]
CMD ["-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}"]