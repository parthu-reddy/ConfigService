package com.fooddelivery.config;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = {"spring.cloud.config.enabled=false"})
class ConfigServerApplicationStartupTest {
@Test
    void contextLoads() {
        // Just tests if context boots correctly
    }
}
