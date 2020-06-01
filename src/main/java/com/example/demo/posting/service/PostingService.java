package com.example.demo.posting.service;

import com.example.demo.posting.domain.PostingVo;
import com.example.demo.posting.repository.PostingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingService {

    @Autowired
    public PostingMapper postingMapper;

    public List<PostingVo> getPostingList(){
        return postingMapper.selectPosting();
    }

}
