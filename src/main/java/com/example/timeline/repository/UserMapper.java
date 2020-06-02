package com.example.timeline.repository;

import com.example.timeline.model.req.ApplyUserReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    void registUser(ApplyUserReq req);
    Integer checkDuplicateUser(ApplyUserReq req);
}
