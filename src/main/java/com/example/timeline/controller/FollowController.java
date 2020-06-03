package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.req.FollowReq;
import com.example.timeline.service.FollowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/timeline/follow")
public class FollowController {

    public final FollowService followService;

    public FollowController(FollowService followService){
        this.followService = followService;
    }

    @PutMapping("/{member_no}")
    public DefaultHttpRes<?> registFollow(@PathVariable("member_no") Integer memberNo, @RequestBody @Validated FollowReq req){
        log.info("follow user req : {}", req );
        followService.registFollow(memberNo, req.getTargetMemberNo());

        return new DefaultHttpRes<Long>(BaseCode.SUCCESS);
    }

    @DeleteMapping("/{member_no}")
    public DefaultHttpRes<?> unfollowUser(@PathVariable("member_no") Integer memberNo, @RequestBody @Validated FollowReq req){
        log.info("unfollow user req : {}", memberNo );
        try {
            followService.unFollow(memberNo, req.getTargetMemberNo());
            return new DefaultHttpRes<Long>(BaseCode.SUCCESS);
        }catch (Exception e){
            return new DefaultHttpRes<Long>(BaseCode.ERR_EXCEPTION);
        }
    }

    @GetMapping("/{member_no}")
    public DefaultHttpRes<?> followList(){
        //TODO 유저의 팔로우 리스트 - 추가 구현 필요
        return null;
    }
}
