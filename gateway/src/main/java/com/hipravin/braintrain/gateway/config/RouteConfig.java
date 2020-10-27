package com.hipravin.braintrain.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
//                .route("httpbin1", r->r.host("**.baeldung.com"))
                .route(r -> r.path("/httpbin/get")
//                        .filters(f -> f.prefixPath("/httpbin"))
                        .filters(f -> f.rewritePath("^/httpbin", ""))
                        .uri("https://httpbin.org")
                        .id("httpbin"))
                .build();
    }
}
