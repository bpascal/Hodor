package com.codido.hodor.bean.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseMatchVo implements Serializable{


    /**
     * 比赛场次ID
     */
    private String matchId;

    /**
     * 选择的号码str，如果是竞彩，则格式为:赔率选项CODE@赔率值，以空格分隔
     */
    private String chooseNumberStr;

    /**
     * 选择时间(仅计算比赛结果时候有用)
     */
    private Date chooseTime;
}

