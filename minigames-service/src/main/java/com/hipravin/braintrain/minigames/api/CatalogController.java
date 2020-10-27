package com.hipravin.braintrain.minigames.api;

import com.hipravin.braintrain.minigames.api.dto.MinigameReferenceDto;
import com.hipravin.braintrain.minigames.api.dto.MinigamesCatalogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api/v1/minigames")
public class CatalogController {

    @GetMapping("/catalog")
    ResponseEntity<?> minigamesCatalog() {
        return null;
    }

    @GetMapping("/catalog-sample")
    ResponseEntity<?> minigamesCatalogSample() {
        return ResponseEntity.ok(sampleCatalog());
    }

    private static MinigamesCatalogDto sampleCatalog() {
        MinigameReferenceDto g1 = new MinigameReferenceDto("game 1", "description 1", "logo1", "/game1");
        MinigameReferenceDto g2 = new MinigameReferenceDto("game 2", "description 2", "logo2", "/game2");
        MinigameReferenceDto g3 = new MinigameReferenceDto("game 3", "description 3", "logo3", "/game3");
        MinigameReferenceDto g4 = new MinigameReferenceDto("game 4", "description 4", "logo4", "/game4");

        MinigamesCatalogDto catalogDto = new MinigamesCatalogDto();
        catalogDto.setMinigames(Arrays.asList(g1, g2, g3, g4));

        return  catalogDto;
    }


}
