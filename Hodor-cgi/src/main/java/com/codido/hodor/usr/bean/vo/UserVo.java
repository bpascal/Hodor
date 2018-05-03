package com.codido.hodor.usr.bean.vo;

import com.codido.hodor.model.UsrUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

/**
 * 用户对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo implements Serializable {

    /**
     * 无参数构造方法
     */
    public UserVo() {
    }

    /**
     * 根据DB对象构造用户对象
     *
     * @param usrUser
     */
    public UserVo(UsrUser usrUser) {
        this.userId = usrUser.getUserId().toString();
        this.userName = usrUser.getUserNickname();
        this.userMblNo = usrUser.getUserMobile();
        this.userHeadImageUrl = usrUser.getUserHeadimgUrl();
        this.userNickName = usrUser.getUserWxNickname();
        this.userIdCode = usrUser.getUserIdcard();
        //this.userTotalBalance
        //this.userAbleBalance
    }

    @ApiModelProperty("用户编号")
    private String userId;

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("用户手机号")
    private String userMblNo;

    @ApiModelProperty("用户图标URL地址")
    private String userHeadImageUrl;

    @ApiModelProperty("用户昵称")
    private String userNickName;

    @ApiModelProperty("用户身份证号")
    private String userIdCode;

    @ApiModelProperty("用户总余额")
    private String userTotalBalance;

    @ApiModelProperty("用户可提现余额")
    private String userAbleBalance;
}
