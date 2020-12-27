# Webshop API with distributed back-end

The API is (almost) the same as for the single-process version.

The difference is in the structure of the back-end. It is split into 3 microservices:

- User service
- Product service
- Buying service

There exists also a proxy service, called webshop-service,which provides the REST endpoints and calls the above
mentioned microservices in order to fulfill the requests.

## Prerequisites

- docker
- docker-compose
- jdk 8+

## Usage

1. Create the images:

Linux:

```bash
./mvnw package jib:dockerBuild -DskipTests
```

Windows:

```bash
mvnw.cmd package jib:dockerBuild -DskipTests
```

2. Create and start the containers:

```bash
docker-compose up
```
