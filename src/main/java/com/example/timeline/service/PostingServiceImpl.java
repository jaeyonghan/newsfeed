package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.PostingInfo;
import com.example.timeline.model.req.CreatePostingReq;
import com.example.timeline.model.res.PostingListRtn;
import com.example.timeline.repository.PostingMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingServiceImpl implements PostingService {

    public final PostingMapper postingMapper;

    public PostingServiceImpl(PostingMapper postingMapper) {
        this.postingMapper = postingMapper;
    }


    @Override
    public DefaultHttpRes<PostingListRtn> getPostingList(Integer memberNo) {
        final DefaultHttpRes<PostingListRtn> result = new DefaultHttpRes<>(BaseCode.SUCCESS);
        PostingListRtn rtn = new PostingListRtn();

        List<PostingInfo> list = postingMapper.selectPostingList(memberNo);


        rtn.setPostingLis(list);
        result.setResult(rtn);

        return result;
    }

    @Override
    public DefaultHttpRes<?> createPosting(CreatePostingReq req) {
        DefaultHttpRes<Integer> result = new DefaultHttpRes<Integer>(BaseCode.SUCCESS);
        try {
            postingMapper.createPosting(req);

            result.setCode(BaseCode.SUCCESS);
        }catch (Exception e){
            result.setCode(BaseCode.ERR_REGIST_PSOTING);
        }
        return result;
    }

    @Override
    public DefaultHttpRes<?> updatePosting() {
        DefaultHttpRes<Integer> result = new DefaultHttpRes<Integer>(BaseCode.SUCCESS);
        result.setCode(BaseCode.SUCCESS);
        return result;
    }

    @Override
    public DefaultHttpRes<?> deletePosting() {
        DefaultHttpRes<Integer> result = new DefaultHttpRes<Integer>(BaseCode.SUCCESS);
        result.setCode(BaseCode.SUCCESS);
        return result;
    }
}
