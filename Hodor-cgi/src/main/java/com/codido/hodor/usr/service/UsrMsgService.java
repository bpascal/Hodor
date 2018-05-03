package com.codido.hodor.usr.service;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.mapper.UsrMsgMapper;
import com.codido.hodor.mapper.UsrMsgOPMapper;
import com.codido.hodor.model.UsrMsg;
import com.codido.hodor.usr.bean.vo.MsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户消息service
 */
@Service
public class UsrMsgService {

    @Autowired
    private UsrMsgMapper usrMsgMapper;
    //拓展的用户信息mapper
    @Autowired
    private UsrMsgOPMapper usrMsgOPMapper;

    /**
     * 获取用户消息列表
     *
     * @param
     * @return
     */
    public List<MsgVo> getUserMsgList(long pageNo, long prePageCount, long userId) {
        List<UsrMsg> usrMsgList = usrMsgOPMapper.getUsrMsgList(pageNo * prePageCount, prePageCount, userId);
        List<MsgVo> msgUnRedVoList = new ArrayList<>();
        List<MsgVo> msgVoList = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        MsgVo msgVo;
        for (UsrMsg usrMsg : usrMsgList) {
            msgVo = new MsgVo();
            msgVo.setMsgId(usrMsg.getMsgId().toString());
            msgVo.setMsgTitle(usrMsg.getMsgTitle());
            msgVo.setMsgInfo(usrMsg.getMsgInfo());
            msgVo.setMsgJumpUrl(usrMsg.getMsgJumpUrl());
            msgVo.setMsgTime(df.format(usrMsg.getMsgTime()));
            msgVo.setMsgType(usrMsg.getMsgType());
            msgVo.setMsgSts(usrMsg.getMsgSts());
            if (usrMsg.getMsgSts().endsWith("I")) {
                msgUnRedVoList.add(msgVo);
            } else {
                msgVoList.add(msgVo);
            }
        }
        msgUnRedVoList.addAll(msgVoList);
        return msgUnRedVoList;
    }

    /**
     * 阅读消息
     *
     * @param userId
     * @param msgId
     */
    @Transactional
    public void readUserMsg(Long userId, Long msgId) {
        UsrMsg usrMsg = usrMsgOPMapper.selectByPrimaryKey(msgId, userId);
        if (usrMsg == null) {
            BaseRetDto retDto = new BaseRetDto();
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("该消息不存在");
        } else {
            usrMsg.setMsgSts("A");
            usrMsgMapper.updateByPrimaryKey(usrMsg);
        }
    }
}
