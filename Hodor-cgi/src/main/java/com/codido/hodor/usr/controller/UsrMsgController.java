package com.codido.hodor.usr.controller;


import com.codido.hodor.common.annotation.AreYouLogin;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.model.UsrMsgExample;
import com.codido.hodor.usr.bean.req.QueryPlayerShopListReq;
import com.codido.hodor.usr.bean.req.QueryUserMsgListReq;
import com.codido.hodor.usr.bean.req.ReadUserMsgReq;
import com.codido.hodor.usr.bean.resp.QueryUserMsgListResp;
import com.codido.hodor.usr.bean.resp.ReadUserMsgResp;
import com.codido.hodor.usr.bean.vo.MsgVo;
import com.codido.hodor.usr.service.UsrMsgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户消息controller
 */
@RestController
@RequestMapping("/msg")
@Api(value = "用户消息", description = "获取用户消息的相关请求")
public class UsrMsgController {

    /**
     * 日志工具
     */
    private static Logger logger = LoggerFactory.getLogger(UsrMsgController.class);
    /**
     * 用户消息service
     */
    private UsrMsgService usrMsgService;

    @Autowired
    public UsrMsgController(UsrMsgService usrMsgService) {
        this.usrMsgService = usrMsgService;
    }


    @ApiOperation(value = "获取用户消息列表", notes = "上传用户TOKENID和分页参数，获取用户消息列表")
    @RequestMapping(value = "/queryUserMsgList", method = RequestMethod.POST)
    @AreYouLogin
    public QueryUserMsgListResp queryUserMsgList(@RequestBody @ApiParam(value = "获取用户消息列表请求对象", required = true) QueryUserMsgListReq req) {
        QueryUserMsgListResp resp = new QueryUserMsgListResp();
        List<MsgVo> msgVoList = usrMsgService.getUserMsgList(Long.parseLong(req.getPageNo()), Long.parseLong(req.getPrePageCount()), req.getUsrUser().getUserId());
        resp.setMsgVoList(msgVoList);
        resp.setCurrentPageNo(req.getPageNo());
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    @ApiOperation(value = "读取用户消息", notes = "根据TOKENID和请求中的MSGID进行消息读取，修改读取状态")
    @RequestMapping(value = "/readUserMsg", method = RequestMethod.POST)
    @AreYouLogin
    public ReadUserMsgResp readUserMsg(@RequestBody @ApiParam(value = "读取用户消息请求对象", required = true) ReadUserMsgReq req) {
        usrMsgService.readUserMsg(req.getUsrUser().getUserId(), Long.parseLong(req.getMsgId()));
        ReadUserMsgResp resp = new ReadUserMsgResp();
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

}
