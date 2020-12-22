package com.codido.hodor.api.usr.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 微信登录 用户信息对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfoVo implements Serializable {

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户头像图片的 URL")
    private String avatarUrl;

    @ApiModelProperty("用户性别")
    private String gender;

    @ApiModelProperty("用户所在国家")
    private String country;

    @ApiModelProperty("用户所在省份")
    private String province;

    @ApiModelProperty("用户所在城市")
    private String city;

    @ApiModelProperty("显示 country，province，city 所用的语言")
    private String language;

}
