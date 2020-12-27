# Full cart - A Webshop REST API

Proof-of-concept project for creating RESTful webservices using Spring Boot, HAL, and Docker.

## 1. Single service

The first part of the project focuses on Spring boot. A RESTFul API is created which uses the HAL+JSON format.

A `Dockerfile` and a `docker-compose.yml` is given for building and running the project in one command line.

## 2. Distributed back-end

This part of the project focuses on multi-party session types. 

The project is divided into microservices. Another service is given which acts as a proxy between the microservices and between the client. The proxy communicates with the client using the previously implemented REST API, and communicates with the microservices using the multi-party session types. 

A `docker-compose.yml` is given for running all the microservices and their corresponding databases in separate, isolated containers.

See the [readme](webshop-distributed/README.md).
