package com.example.timeline.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface FollowMapper {
    void registFollow(Integer memberNo, Integer targetMemberNo);
}
