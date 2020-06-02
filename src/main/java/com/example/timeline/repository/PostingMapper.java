package com.example.timeline.repository;

import com.example.timeline.common.DefaultHttpRes;

import com.example.timeline.model.PostingInfo;
import com.example.timeline.model.req.CreatePostingReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PostingMapper {

    List<PostingInfo> selectPostingList(Integer memberNo);
    void createPosting(CreatePostingReq req);
}
