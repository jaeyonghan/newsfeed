package com.example.timeline.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.beans.DefaultProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistFollowReq {

    @JsonProperty("target_member_no")
    Integer targetMemberNo;
}
