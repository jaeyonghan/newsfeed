package com.example.demo.posting.repository;

import com.example.demo.posting.domain.PostingVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PostingMapper {
    List<PostingVo> selectPosting();
}
