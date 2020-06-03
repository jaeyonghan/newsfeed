package com.example.timeline.controller;

import com.example.timeline.common.DefaultHttpRes;
import com.example.timeline.common.code.BaseCode;
import com.example.timeline.model.req.ApplyUserReq;
import com.example.timeline.service.UserService;
import com.example.timeline.testenv.AbstractMockController;
import com.example.timeline.testenv.UserControllerInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class UserControllerTest extends AbstractMockController<UserController> {

    @InjectMocks
    private UserController controller;
    @Mock
    private UserService userService;
    UserControllerInterface is = new UserControllerInterface();
    static ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public UserController getController() {
        return controller;
    }

    private ApplyUserReq req = new ApplyUserReq();

    @Test
    public void create_user_valid_param() throws Exception{
        //given
        req.setUserId("test");
        req.setNickName("hi");

        //when
        when(userService.applyUser(req)).thenReturn(new DefaultHttpRes<>(BaseCode.SUCCESS));
        MockHttpServletResponse response = is.registUser(mockMvc, req);

        //then
        SUCCESS(response);
        verify(userService, times(1)).applyUser(req);

    }

    @Test
    public void create_user_inValid_param() throws Exception{
        //given
        req.setUserId("test");
        req.setNickName(null);

        //when
        when(userService.applyUser(req)).thenReturn(new DefaultHttpRes<>(BaseCode.SUCCESS));
        MockHttpServletResponse response = is.registUser(mockMvc, req);

        //then
        ERR_PARAM(response);
        verify(userService, times(0)).applyUser(req);

    }

    public static DefaultHttpRes<?> SUCCESS(MockHttpServletResponse response) throws Exception{
        return assertion(response, BaseCode.SUCCESS);
    }

    public static DefaultHttpRes<?> ERR_PARAM(MockHttpServletResponse response) throws Exception{
        return assertion(response, BaseCode.ERR_PARAM);
    }

    public static DefaultHttpRes<?> assertion(MockHttpServletResponse response, BaseCode responseCode) throws Exception{
        DefaultHttpRes<?> baseResponse = objectMapper.readValue(response.getContentAsString(), DefaultHttpRes.class);

        assertThat(response.getStatus(), is(HttpStatus.OK.value()));
        assertThat(baseResponse.getReturnMessage(), is(responseCode.message()));
        assertThat(baseResponse.getReturnCode(), is(responseCode.code()));

        return baseResponse;
    }
}