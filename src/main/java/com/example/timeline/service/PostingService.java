package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.PostingVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostingService {
    DefaultHttpRes<List<PostingVo>> getPostingList();
    DefaultHttpRes<?> createPosting();
    DefaultHttpRes<?> updatePosting();
    DefaultHttpRes<?> deletePosting();
}
