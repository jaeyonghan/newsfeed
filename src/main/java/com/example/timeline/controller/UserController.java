package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.req.ApplyUserReq;
import com.example.timeline.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeline/user")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("")
    public DefaultHttpRes<?> applyUser(@RequestBody ApplyUserReq req){

        if(req == null )
            return new DefaultHttpRes<>(BaseCode.ERR_PARAM);
        else if(req.getNickName().isEmpty() || req.getUserId().isEmpty())
            return new DefaultHttpRes<>(BaseCode.ERR_PARAM);


        return userService.applyUser(req);
    }
}
