package com.fooddelivery.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(
    scanBasePackages = {"com.fooddelivery.config", "com.fooddelivery.common"}
)
@org.springframework.context.annotation.ComponentScan({"com.fooddelivery", "com.fooddelivery.common"})
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
