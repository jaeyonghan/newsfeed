package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.NewsFeed;
import com.example.timeline.service.NewsFeedService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newsfeed")
public class NewsFeedController {

    public final NewsFeedService newsfeedService;

    public NewsFeedController(@Qualifier("newsFeedServiceImpl") NewsFeedService newsfeedService) {
        this.newsfeedService = newsfeedService;
    }

    @GetMapping("/list")
    public DefaultHttpRes<List<NewsFeed>> getNewsFeedList(){
        return newsfeedService.getNewsFeedList();
    }
}
