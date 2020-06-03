package com.example.timeline.service;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.req.ApplyUserReq;
import com.example.timeline.repository.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper){this.userMapper = userMapper;}

    @Override
    public DefaultHttpRes<?> applyUser(ApplyUserReq req) {

        DefaultHttpRes<?> result = new DefaultHttpRes<>(BaseCode.SUCCESS);

        if(checkDuplicateUser(req)){
            result.setCode(BaseCode.EXIST_USER_INFO);
            return result;
        }
        userMapper.registUser(req);

        return result;
    }

    public Boolean checkDuplicateUser(ApplyUserReq req){
        Integer result = userMapper.checkDuplicateUser(req);
        if(result > 0) return true;

        return false;
    }
}
