package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.PostingInfo;
import com.example.timeline.model.req.CreatePostingReq;
import com.example.timeline.model.res.PostingListRtn;
import com.example.timeline.service.PostingService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("timeline/posting")
public class PostingController {

    public final PostingService postingService;

    public PostingController(PostingService postingService) {
        this.postingService = postingService;
    }

    @GetMapping("/{member_no}")
    public DefaultHttpRes<PostingListRtn> getPostingList(@PathVariable(value = "member_no") int memberNo) {
        return postingService.getPostingList(memberNo);
    }

    @PostMapping("")
    public DefaultHttpRes<?> createPosting(@RequestBody @Validated CreatePostingReq req){

        return postingService.createPosting(req);
    }

    @PutMapping("/{postNo}")
    public DefaultHttpRes<?> updatePosting(@PathVariable(value = "postNo") int postNo){
        //TODO 추가 구현 필요
        return postingService.updatePosting();
    }

    @DeleteMapping("/{postNo}")
    public DefaultHttpRes<?> deletePosting(@PathVariable(value = "postNo") int postNo){
        //TODO 추가 구현 필요
        return postingService.deletePosting();
    }


}
