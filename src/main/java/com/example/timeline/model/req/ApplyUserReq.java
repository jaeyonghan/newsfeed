package com.example.timeline.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApplyUserReq {

    @JsonProperty("user_id")
    String userId;

    @JsonProperty("nick_name")
    String nickName;

}
