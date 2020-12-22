package com.codido.hodor.api.ord.controller;

import com.codido.hodor.api.common.annotation.AreYouLogin;
import com.codido.hodor.api.ord.bean.resp.ApplyOrderResp;
import com.codido.hodor.api.ord.bean.req.ApplyOrderReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Api(value = "订单申请", description = "订单申请请求")
@Slf4j
public class OrdController {

    @ApiOperation(value = "申请订单", notes = "申请订单请求")
    @RequestMapping(value = "/applyForOrder", method = RequestMethod.POST)
    @AreYouLogin
    public ApplyOrderResp applyForOrder(@RequestBody @ApiParam(value = "用户添加订阅请求对象", required = true) ApplyOrderReq req) throws Exception {
        // 用户添加自定义订阅
        ApplyOrderResp resp = new ApplyOrderResp();
        return resp;
    }
}
