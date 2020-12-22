package com.codido.hodor.api.usr.controller;

import com.codido.hodor.api.usr.service.UserServiceImpl;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
