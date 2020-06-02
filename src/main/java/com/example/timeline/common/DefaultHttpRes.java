package com.example.timeline.common;

import com.example.timeline.common.code.BaseCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DefaultHttpRes<T> {
    @JsonProperty("return_code")
    Integer returnCode;

    @JsonProperty("return_message")
    String returnMessage;

    @JsonProperty("context")
    T result;

    public DefaultHttpRes(BaseCode baseCode) {
        this.setCode(baseCode);
    }

    public void setCode(BaseCode baseCode) {
        setReturnCode(baseCode.code());
        setReturnMessage(baseCode.message());
    }
}
