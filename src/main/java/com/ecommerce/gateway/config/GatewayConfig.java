package com.ecommerce.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Gateway Route Configuration
 * 
 * Defines routing rules for all microservices.
 * Routes are configured to forward requests to appropriate backend services.
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // Auth Service Routes
                .route("auth-service", r -> r
                        .path("/api/auth/**")
                        .uri("http://localhost:8081"))
                
                // Order Service Routes
                .route("order-service", r -> r
                        .path("/api/orders/**")
                        .uri("http://localhost:8082"))
                
                // Inventory Service Routes
                .route("inventory-service", r -> r
                        .path("/api/inventory/**")
                        .uri("http://localhost:8083"))
                
                // Payment Service Routes
                .route("payment-service", r -> r
                        .path("/api/payments/**")
                        .uri("http://localhost:8084"))
                
                // Notification Service Routes
                .route("notification-service", r -> r
                        .path("/api/notifications/**")
                        .uri("http://localhost:8085"))
                
                .build();
    }
}
