package com.ecommerce.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * API Gateway Service
 * 
 * Central entry point for all client requests.
 * Routes requests to appropriate microservices and handles cross-cutting concerns
 * like authentication, rate limiting, and request/response transformation.
 */
@SpringBootApplication
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
