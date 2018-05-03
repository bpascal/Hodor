package com.codido.hodor.ord.bean.vo;

import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.model.LotMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * 比赛日对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class MatchDateVo implements Serializable{

    /**
     * 通过日期构造日期对象
     * @param date
     */
    public MatchDateVo(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.dateName = calendar.get(Calendar.DAY_OF_MONTH)+"";
        this.dateDesc = JBDateUtil.getWeekOfDate(date);
        this.dateName = JBDateUtil.transDate2String(date,"",JBDateUtil.dateFormat_yyyy_MM_dd);
    }

    @ApiModelProperty("日期编码(保留字段，目前留空)")
    private String dateId;

    @ApiModelProperty("日期")
    private String dateName;

    @ApiModelProperty("日期描述")
    private String dateDesc;

}
