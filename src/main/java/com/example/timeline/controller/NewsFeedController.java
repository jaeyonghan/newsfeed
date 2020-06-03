package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.NewsFeed;
import com.example.timeline.service.NewsFeedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/timeline/newsfeed")
public class NewsFeedController {

    public final NewsFeedService newsfeedService;

    public NewsFeedController( NewsFeedService newsfeedService) {
        this.newsfeedService = newsfeedService;
    }

    @GetMapping("/{member_no}")
    public DefaultHttpRes<List<NewsFeed>> getNewsFeedList(@PathVariable("member_no")Integer memberNo){
        log.info("getNewsFeedList req : {}", memberNo);
        return newsfeedService.getNewsFeedList(memberNo);
    }
}
