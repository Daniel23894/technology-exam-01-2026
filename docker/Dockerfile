# stage 1: Build stage , base image (Builder pattern)
FROM maven:3.9.9-eclipse-temurin-21-alpine AS builder
WORKDIR /app

# cache kun dependencies for optimeret build tid
COPY ../pom.xml .
RUN mvn dependency:go-offline

#  kopier kildekoden og byg applikationen, -DskipTests pga CI-pipeline
COPY ../src ./src
RUN mvn package -DskipTests


# stage 2: Run stage
# reducere størrelsen på det endelige image, JDK to JRE
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# kopierer kun den eksekverbare fil fra stage 1
COPY --from=builder /app/target/*.jar app.jar

# porten som applikationen inde i containeren lytter på
EXPOSE 8080

# eksekveres når containeren starter op
ENTRYPOINT ["java", "-jar", "app.jar"]