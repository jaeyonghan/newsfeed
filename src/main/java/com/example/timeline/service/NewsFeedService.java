package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.NewsFeed;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsFeedService {
    DefaultHttpRes<List<NewsFeed>> getNewsFeedList();
}
