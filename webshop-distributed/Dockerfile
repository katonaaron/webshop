#### Stage 1: Build the application
#FROM openjdk:8-jdk-alpine as build
FROM maven:3.6.3-openjdk-8-slim as build

ARG MODULE

# Set the current working directory inside the image
WORKDIR /app

# Copy maven executable to the image
COPY pom.xml .

WORKDIR /app/${MODULE}

# Copy the pom.xml file
COPY ${MODULE}/pom.xml .

# Build all the dependencies in preparation to go offline.
# This is a separate step so the dependencies will be cached unless
# the pom.xml file has changed.
RUN mvn dependency:go-offline -B

RUN mvn -B dependency:resolve dependency:resolve-plugins

# Copy the project source
COPY ${MODULE}/src src

# Package the application
RUN mvn package -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

#### Stage 2: A minimal docker image with command to run the app
FROM openjdk:8-jre-alpine

ARG MODULE
ARG MAIN_CLASS
ENV ENV_MAIN_CLASS=$MAIN_CLASS
ARG DEPENDENCY=/app/${MODULE}/target/dependency

# Copy project dependencies from the build stage
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT java -cp "app:app/lib/*" "${ENV_MAIN_CLASS}"
