package com.hipravin.braintrain.minigames.api.dto;

public class MinigameReferenceDto {
    private String title;
    private String description;
    /**
     * name of logo file. The file itself should be available on frontend and stored at particular path
     */
    private String logoFileName;
    private String relativeUrl;

    public MinigameReferenceDto() {
    }

    public MinigameReferenceDto(String title, String description, String logoFileName, String relativeUrl) {
        this.title = title;
        this.description = description;
        this.logoFileName = logoFileName;
        this.relativeUrl = relativeUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogoFileName() {
        return logoFileName;
    }

    public void setLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
    }

    public String getRelativeUrl() {
        return relativeUrl;
    }

    public void setRelativeUrl(String relativeUrl) {
        this.relativeUrl = relativeUrl;
    }
}
