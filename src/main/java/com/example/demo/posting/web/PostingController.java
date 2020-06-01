package com.example.demo.posting.web;

import com.example.demo.posting.domain.PostingVo;
import com.example.demo.posting.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostingController {

    @Autowired
    public PostingService postingService;

    @GetMapping("/posting/list/test")
    public List<PostingVo> getTest(){
        return postingService.getPostingList();
    }

}
