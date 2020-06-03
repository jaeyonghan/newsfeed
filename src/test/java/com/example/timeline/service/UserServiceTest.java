package com.example.timeline.service;

import com.example.timeline.model.req.ApplyUserReq;
import com.example.timeline.repository.UserMapper;
import com.example.timeline.testenv.UserServiceRequestFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    UserServiceImpl userService;
    @Mock
    UserMapper userMapper;

    @Test
    public void regist_user_valid(){
        //given
        ApplyUserReq req = UserServiceRequestFactory.getValidobject();

        //when
        userService.applyUser(req);

        //then
        verify(userMapper, times(1)).registUser(req);
    }

    @Test
    public void regist_user_inValid(){
        //given
        ApplyUserReq req = UserServiceRequestFactory.getInValidObject();

        //when
        when(userMapper.checkDuplicateUser(req)).thenReturn(1);
        userService.applyUser(req);

        //then
        verify(userMapper, times(1)).checkDuplicateUser(req);
        verify(userMapper, times(0)).registUser(req);
    }
}
