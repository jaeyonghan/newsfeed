package com.example.timeline.testenv;

import com.example.timeline.controller.UserController;
import com.example.timeline.model.req.ApplyUserReq;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;

public class UserControllerInterface {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public MockHttpServletResponse registUser(MockMvc mockMvc, ApplyUserReq req) throws Exception {
        String requestBody =  new ObjectMapper().valueToTree(req).toString();

        return mockMvc.perform(post("/timeline/user")
                .content(requestBody)
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(handler().handlerType(UserController.class))
                .andExpect(handler().methodName("applyUser"))
                .andDo(print())
                .andReturn()
                .getResponse();
    }
}
