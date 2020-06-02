package com.example.timeline.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreatePostingReq {

    @JsonProperty("member_no")
    Integer memberNo;

    @JsonProperty("content")
    String content;

    @JsonProperty("content_type")
    Integer contentType;

}
