package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.PostingVo;
import com.example.timeline.repository.PostingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingServiceImpl implements PostingService {

    public final PostingMapper postingMapper;

    public PostingServiceImpl(PostingMapper postingMapper) {
        this.postingMapper = postingMapper;
    }

    public DefaultHttpRes<List<PostingVo>> getPostingList(){
        return postingMapper.selectPosting();
    }

    @Override
    public DefaultHttpRes<?> createPosting() {
        DefaultHttpRes<Integer> result = new DefaultHttpRes<Integer>(BaseCode.SUCCESS);
        result.setResult(1);
        return result;
    }

    @Override
    public DefaultHttpRes<?> updatePosting() {
        DefaultHttpRes<Integer> result = new DefaultHttpRes<Integer>(BaseCode.SUCCESS);
        result.setResult(1);
        return result;
    }

    @Override
    public DefaultHttpRes<?> deletePosting() {
        DefaultHttpRes<Integer> result = new DefaultHttpRes<Integer>(BaseCode.SUCCESS);
        result.setResult(1);
        return result;
    }
}
