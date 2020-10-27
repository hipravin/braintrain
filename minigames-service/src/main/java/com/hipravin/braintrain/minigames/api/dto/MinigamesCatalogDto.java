package com.hipravin.braintrain.minigames.api.dto;

import java.util.List;

public class MinigamesCatalogDto {
    private List<MinigameReferenceDto> minigames;

    public List<MinigameReferenceDto> getMinigames() {
        return minigames;
    }

    public void setMinigames(List<MinigameReferenceDto> minigames) {
        this.minigames = minigames;
    }
}
