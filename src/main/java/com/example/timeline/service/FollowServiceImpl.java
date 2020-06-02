package com.example.timeline.service;

import com.example.timeline.repository.FollowMapper;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService {

    private final FollowMapper followMapper;

    public FollowServiceImpl(FollowMapper followMapper){
        this.followMapper = followMapper;
    }

    @Override
    public void registFollow(Integer memberNo, Integer targetMemberNo) {
        followMapper.registFollow(memberNo, targetMemberNo);
    }
}
