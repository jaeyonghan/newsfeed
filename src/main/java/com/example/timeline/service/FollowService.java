package com.example.timeline.service;

import org.springframework.stereotype.Service;

@Service
public interface FollowService {
    void registFollow(Integer memberNo, Integer targetMemberNo);
    void unFollow(Integer memberNo, Integer targetMemberNo);
}
