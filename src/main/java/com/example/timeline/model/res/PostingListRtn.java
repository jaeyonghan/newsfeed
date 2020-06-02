package com.example.timeline.model.res;

import com.example.timeline.model.PostingInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostingListRtn {

    @JsonProperty("posting_list")
    List<PostingInfo> postingLis;
}
