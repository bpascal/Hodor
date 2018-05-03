package com.codido.hodor.usr.bean.vo;

import com.codido.hodor.model.UsrUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * 用户实名信息对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRealNameVo implements Serializable {

    @ApiModelProperty("用户实名")
    private String userRealName;

    @ApiModelProperty("用户身份证号")
    private String userIdCard;

    @ApiModelProperty("用户手机号")
    private String userMblNo;

    @ApiModelProperty("短信验证码")
    private String smsCode;


    public UserRealNameVo(){
        super();
    }

    public UserRealNameVo(UsrUser usrUser){
        super();
        //setUserIdCard(usrUser.getUserIdcard());
        setUserIdCard(usrUser.getUserIdcard().substring(0,4)+"****"+usrUser.getUserIdcard().substring(usrUser.getUserIdcard().length()-4));//身份证号做特殊处理
        setUserRealName(usrUser.getUserRealname());
        setUserMblNo(usrUser.getUserMobile());
    }
}
