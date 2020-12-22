package com.codido.hodor.job.job.bean.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 传送给终端后台的选号对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SendOrderChooseDto implements Serializable {

    /**
     * 选择的号码字串,同区号码已空格分隔,不同区之间以:分隔
     */
    private String chooseNumberStr;
}
