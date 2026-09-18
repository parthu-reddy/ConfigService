# ConfigService

The ConfigService acts as the centralized configuration server for all microservices in the Food Delivery ecosystem. It leverages Spring Cloud Config to serve environment-specific configuration files (YAML/Properties).

## Setup & Build
1. Build the service: `mvn clean install`
2. Run the application: `mvn spring-boot:run`
3. Port: `8888` (Standard port for Spring Cloud Config)

## Key Responsibilities
- **Centralized Configuration**: Stores and serves configuration properties for `ApiGateway`, `CustomerApplication`, etc.
- **Environment Management**: Supports multiple profiles (`dev`, `prod`, `test`) to manage configurations per environment.
- **Dynamic Updates**: Enables microservices to refresh their configurations dynamically (via `@RefreshScope`) without restarting.

