package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.req.RegistFollowReq;
import com.example.timeline.service.FollowService;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timeline/follow")
public class FollowController {

    public final FollowService followService;

    public FollowController(FollowService followService){
        this.followService = followService;
    }

    @PutMapping("/{member_no}")
    public DefaultHttpRes<?> followUser(@PathVariable("member_no") Integer memberNo, @RequestBody @Validated RegistFollowReq req){
        followService.registFollow(memberNo, req.getTargetMemberNo());

        return new DefaultHttpRes<Long>(BaseCode.SUCCESS);
    }

    @PutMapping("/unfollow/{id}")
    public void unfollowUser(){
        //TODO 언팔로우 처리 - 추가 구현 필요
    }

    @GetMapping("/{member_no}")
    public DefaultHttpRes<?> followList(){
        //TODO 유저의 팔로우 리스트 - 추가 구현 필요
        return null;
    }
}
