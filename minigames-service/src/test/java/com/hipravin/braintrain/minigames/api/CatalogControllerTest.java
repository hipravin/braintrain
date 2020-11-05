package com.hipravin.braintrain.minigames.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CatalogControllerTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void testSampleCatalog() {
        webClient
                .get().uri("/api/v1/minigames/catalog-sample")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.minigames[0].title").isEqualTo("game 1");

    }
}