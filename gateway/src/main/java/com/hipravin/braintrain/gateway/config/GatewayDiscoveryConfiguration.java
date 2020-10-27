package com.hipravin.braintrain.gateway.config;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
@Configuration
@EnableDiscoveryClient
public class GatewayDiscoveryConfiguration {

//    @Bean
//    DiscoveryClientRouteDefinitionLocator discoveryRoutes(ReactiveDiscoveryClient rdc,
//                                                          DiscoveryLocatorProperties dlp) {
//        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
//    }

//    @Bean
//    public DiscoveryClientRouteDefinitionLocator discoveryClientRouteLocator(DiscoveryClient discoveryClient) {
//
//        return new DiscoveryClientRouteDefinitionLocator(discoveryClient);
//    }
}