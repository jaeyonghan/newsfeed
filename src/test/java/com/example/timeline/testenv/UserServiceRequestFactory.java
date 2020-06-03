package com.example.timeline.testenv;

import com.example.timeline.model.req.ApplyUserReq;

public class UserServiceRequestFactory {

    private static ApplyUserReq validobject;
    static {
        validobject = new ApplyUserReq();
        validobject.setNickName("testNickName@test.com");
        validobject.setUserId("testId");
    }

    private static ApplyUserReq inValidObject;
    static {
        inValidObject = new ApplyUserReq();
        inValidObject.setUserId("test@test.com");
        inValidObject.setNickName("test");
    }

    public static ApplyUserReq getValidobject(){return validobject;}
    public static ApplyUserReq getInValidObject(){return inValidObject;}
}
