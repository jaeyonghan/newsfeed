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

    public NewsFeedController( NewsFeedService newsfeedService) {
        this.newsfeedService = newsfeedService;
    }

    @GetMapping("/list")
    public DefaultHttpRes<List<NewsFeed>> getNewsFeedList(){

        //TODO 추가 구현 필요
        return newsfeedService.getNewsFeedList();
    }
}
