package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.model.req.ApplyUserReq;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    DefaultHttpRes<?> applyUser(ApplyUserReq req);
}
