---
name: config-service-api
description: API reference for the ConfigService. Use this to understand how microservices fetch their properties from the central configuration server.
---

# ConfigService API Reference

The ConfigService acts as a Spring Cloud Config Server. It serves configuration properties natively via REST to Spring Boot applications.

## Endpoints

### Fetch Application Config
`GET /{application}/{profile}`

- **Description**: Returns the JSON representation of the properties for the specified application and profile.
- **Parameters**:
  - `{application}`: The `spring.application.name` of the requesting service (e.g., `customer-app`).
  - `{profile}`: The active profile (e.g., `dev`, `prod`).
- **Response**: A Spring Environment object containing `propertySources`.

### Fetch File Config
`GET /{application}/{profile}/{label}/{path}`

- **Description**: Returns a plain text file (e.g., application.yml) for a specific git branch/label.

## Usage in Microservices
Microservices do not call these endpoints directly using `RestTemplate` or `Feign`. Instead, they include `spring-cloud-starter-config` and specify `spring.config.import=optional:configserver:http://localhost:8888` in their `application.yml`.
