package com.gam.erp.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("iam-service", r -> r
                        .path("/iam/**")
                        .uri("lb://iam-service"))
                .route("user-service", r -> r
                        .path("/users/**")
                        .uri("lb://user-service"))
                .build();
    }
}
