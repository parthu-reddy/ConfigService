---
name: understand-config-service
description: Architectural overview and troubleshooting guide for the ConfigService. Use this to understand how central configuration is securely served to the microservices.
---

# Understand ConfigService

The ConfigService ensures that configuration properties are decoupled from the application code, enabling central governance and easy environment management.

## Architecture

- **Backend Repository**: By default, Spring Cloud Config uses a Git repository to store configuration files. It can also be configured to read from a local file system (native profile) or a database.
- **Refresh Scope**: Downstream services use `@RefreshScope` on beans that need to dynamically update their properties without a JVM restart.

## Troubleshooting

- **Service Boot Failures**: If a microservice fails to start because it cannot resolve `http://localhost:8888`, ensure the ConfigService is running *before* starting any other service.
- **Outdated Properties**: If a property is updated in the backing repository but not reflecting in the application, verify that a `POST /actuator/refresh` was issued to the target microservice.
- **Decryption Errors**: If using encrypted properties (`{cipher}...`), ensure the ConfigService is configured with the correct keystore or symmetric key to decrypt them before serving them to the client.
