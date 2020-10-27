package com.hipravin.braintrain.minigames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MinigamesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinigamesServiceApplication.class);
    }
}
