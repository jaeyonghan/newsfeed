package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.PostingVo;
import com.example.timeline.service.PostingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posting")
public class PostingController {

    public final PostingService postingService;

    public PostingController(PostingService postingService) {
        this.postingService = postingService;
    }

    @GetMapping("/list")
    public DefaultHttpRes<List<PostingVo>> getPostingList(@PathVariable(value = "id") int id) {
        return postingService.getPostingList();
    }

    @PostMapping("")
    public DefaultHttpRes<?> createPosting(){
        return postingService.createPosting();
    }

    @PutMapping("/{postNo}")
    public DefaultHttpRes<?> updatePosting(@PathVariable(value = "postNo") int postNo){
        return postingService.updatePosting();
    }

    @DeleteMapping("/{postNo}")
    public DefaultHttpRes<?> deletePosting(@PathVariable(value = "postNo") int postNo){
        return postingService.deletePosting();
    }


}
