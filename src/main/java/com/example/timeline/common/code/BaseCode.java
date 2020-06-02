package com.example.timeline.common.code;

public enum  BaseCode {
    SUCCESS(0,"Success")
    ,ERR_PARAM(502, "Parameter Error.")
    ,ERR_REGIST_PSOTING(503, "Fail Regist Posting.")
    ,EXIST_USER_INFO(601, "Already Exist User.")
    ;

    private final int code;
    private final String message;

    BaseCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int code(){return this.code;}
    public String message(){return  this.message;}
}
