package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.PostingInfo;
import com.example.timeline.model.req.CreatePostingReq;
import com.example.timeline.model.res.PostingListRtn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostingService {
    DefaultHttpRes<PostingListRtn> getPostingList(Integer memberNo);
    DefaultHttpRes<?> createPosting(CreatePostingReq req);
    DefaultHttpRes<?> updatePosting();
    DefaultHttpRes<?> deletePosting();
}
