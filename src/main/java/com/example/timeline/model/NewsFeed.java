package com.example.timeline.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewsFeed {

    @JsonProperty("post_no")
    Integer postNo;

    @JsonProperty("content")
    String content;

    @JsonProperty("content_type")
    String contentType;

}
