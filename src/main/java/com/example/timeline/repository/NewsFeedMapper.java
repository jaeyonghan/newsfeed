package com.example.timeline.repository;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.NewsFeed;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsFeedMapper {
    DefaultHttpRes<List<NewsFeed>> getNewsFeedList();
}
