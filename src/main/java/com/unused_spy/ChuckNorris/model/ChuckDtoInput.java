package com.unused_spy.ChuckNorris.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class ChuckDtoInput {
    private List<String> categories;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("icon_url")
    private String iconUrl;
    private String id;
    @JsonProperty("updated_at")
    private String updatedAt;
    private String url;
    private String value;




}
