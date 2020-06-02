package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.NewsFeed;
import com.example.timeline.repository.NewsFeedMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsFeedServiceImpl implements NewsFeedService {

    public final NewsFeedMapper newsFeedMapper;

    public NewsFeedServiceImpl(NewsFeedMapper newsFeedMapper) {
        this.newsFeedMapper = newsFeedMapper;
    }

    @Override
    public DefaultHttpRes<List<NewsFeed>> getNewsFeedList() {
        return null;
    }
}
