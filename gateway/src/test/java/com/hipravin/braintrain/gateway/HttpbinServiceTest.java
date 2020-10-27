package com.hipravin.braintrain.gateway;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpbinServiceTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void testGet() throws Exception {
        webClient
                .get().uri("/httpbin/get")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.headers.Host").isEqualTo("httpbin.org");
    }

    @Test
    public void testHello() throws Exception {
        webClient
                .get().uri("/api/v1/ping")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.status").isEqualTo("up");
    }
}

