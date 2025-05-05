package com.codido.hodor.api.usr.controller;

import com.codido.hodor.api.common.annotation.AreYouLogin;
import com.codido.hodor.api.common.util.ChatQAUtil;
import com.codido.hodor.api.ord.bean.req.ApplyOrderReq;
import com.codido.hodor.api.ord.bean.resp.ApplyOrderResp;
import com.codido.hodor.api.usr.bean.req.QwenQuestionReq;
import com.codido.hodor.api.usr.bean.resp.QwenQuestionResp;
import com.codido.hodor.api.usr.service.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户controller
 */
@Slf4j
@RestController
@RequestMapping("/usr")
@Api(value = "用户信息", description = "获取用户信息的相关请求")
public class UserController {
    /**
     * 用户service
     */
    @Autowired
    private UserServiceImpl userServiceImpl;


    @ApiOperation(value = "提问", notes = "提问")
    @RequestMapping(value = "/querstion", method = RequestMethod.POST)
    @AreYouLogin
    public QwenQuestionResp querstion(@RequestBody @ApiParam(value = "提问", required = true) QwenQuestionReq req) throws Exception {
        // 用户添加自定义订阅
        QwenQuestionResp resp = new QwenQuestionResp();
        String result = ChatQAUtil.question(req.getQuestion(), req.getPrompt(), req.getResultFormat());
        resp.setAnswerText(result);
        return resp;
    }

}
