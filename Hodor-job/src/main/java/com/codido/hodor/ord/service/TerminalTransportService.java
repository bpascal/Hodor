package com.codido.hodor.ord.service;


import com.alibaba.fastjson.JSON;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.job.bean.dto.*;
import com.codido.hodor.job.config.EvnConfig;
import com.codido.hodor.mapper.LotInstMapper;
import com.codido.hodor.mapper.OrdBettingInstOPMapper;
import com.codido.hodor.model.LotInst;
import com.codido.hodor.model.OrdBettingInst;
import com.codido.hodor.model.OrdOrder;
import com.codido.hodor.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 与终端服务器的通讯service
 */
@Service
public class TerminalTransportService {


    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(TerminalTransportService.class);

    /**
     * 号码mapper
     */
    @Autowired
    private OrdBettingInstOPMapper ordBettingInstMapper;

    /**
     * 彩种实例mapper
     */
    @Autowired
    private LotInstMapper lotInstMapper;

    /**
     * 环境参数
     */
    @Autowired
    private EvnConfig evnConfig;


    /**
     * 调用终端的后台服务，发送订单信息方法
     *
     * @param ordOrder
     * @return
     */
    public SendOrderToTerminalRetDto sendOrderToTerminal(OrdOrder ordOrder) {
        logger.info("sendOrderToTerminal方法进入，准备进行接口调用");
        SendOrderToTerminalRetDto retDto = new SendOrderToTerminalRetDto();
        LotInst lotInst = lotInstMapper.selectByPrimaryKey(ordOrder.getLottoInstId());
        List<OrdBettingInst> ordBettingInstList = ordBettingInstMapper.selectByOrderNo(ordOrder.getOrderNo());

        //请求对象
        SendOrderToTerminalRequestDto reqDto = new SendOrderToTerminalRequestDto();
        //订单对象
        SendOrderDetailDto sendOrderDetailDto = new SendOrderDetailDto();
        sendOrderDetailDto.setBetTimes(ordOrder.getBetTimes().toString());
        sendOrderDetailDto.setLotteryId(lotInst.getLottoId().toString());
        //sendOrderDetailDto.setLotteryPeriod(lotInst.getPeriodName());
        List<SendOrderChooseDto> sendOrderChooseDtoList = new ArrayList<>();
        if (!JBUtil.isListEmpty(ordBettingInstList)) {
            for (OrdBettingInst ordBettingInst : ordBettingInstList) {
                SendOrderChooseDto sendOrderChooseDto = new SendOrderChooseDto();
                sendOrderChooseDto.setChooseNumberStr(ordBettingInst.getChooseNumber());
                sendOrderChooseDtoList.add(sendOrderChooseDto);
            }
        }
        sendOrderDetailDto.setChooseList(sendOrderChooseDtoList);
        reqDto.setOrderDetail(sendOrderDetailDto);
        //订单号
        reqDto.setOrderNo(ordOrder.getOrderNo());

        //组装接口参数并发送
        String respStr = HttpClientUtil.doJsonPost(evnConfig.getTerminalContext() + "/lottery/robot/insertLottery", JSON.toJSONString(reqDto));
        logger.info("证通服务器接口返回:" + respStr);
        SendOrderToTerminalResponseDto resp = JSON.parseObject(respStr, SendOrderToTerminalResponseDto.class);
        logger.info("证通服务器接口返回参数转化后为:" + resp.toString());
        if (resp.getResultCode() == 1 && !JBUtil.isStrEmpty(resp.getContent())) {
            retDto.setHandlerResult(true);
            retDto.setOrderTicketUrl(resp.getContent());
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg(resp.getErrMsg());
        }
        return retDto;
    }
}
