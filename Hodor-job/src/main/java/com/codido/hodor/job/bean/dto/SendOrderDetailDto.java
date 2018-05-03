package com.codido.hodor.job.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 传送给终端后台的订单对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SendOrderDetailDto implements Serializable {

    private String betTimes;

    private String lotteryId;

    private String lotteryPeriod;

    private List<SendOrderChooseDto> chooseList;
}
