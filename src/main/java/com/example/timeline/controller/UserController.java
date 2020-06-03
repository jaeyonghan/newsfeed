package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.req.ApplyUserReq;
import com.example.timeline.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/timeline/user")
//회원 정보와 관련된 Controller - 현재는 user테이블에 insert api만 개발완료.
public class UserController {

    public final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("")
    public DefaultHttpRes<?> applyUser(@RequestBody ApplyUserReq req){
        log.info("applyUser req is : {}", req);

        if(req == null )
            return new DefaultHttpRes<>(BaseCode.ERR_PARAM);
        else if(req.getNickName() == null || req.getUserId() == null )
            return new DefaultHttpRes<>(BaseCode.ERR_PARAM);


        return userService.applyUser(req);
    }
}
