package com.codido.hodor.common.bean.req;

import com.codido.hodor.model.ShpShop;
import com.codido.hodor.model.UsrUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;
import java.util.List;

/**
 * 整体请求基类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class BaseReq implements Serializable {

    @ApiModelProperty("用户TOKENID")
    private String tokenId;

    @ApiModelProperty("页面上传的渠道标识，从页面参数获取，可为空，空的情况下做彩士多公众号处理:LOTTO_STORE_MP:彩士多公众号,ZDJL_MP:中大奖了公众号")
    private String channelFlag;

    /**
     * 用户对象
     */
    @ApiModelProperty(hidden = true)
    private UsrUser usrUser;

    /**
     * 用户所属店铺对象
     */
    @ApiModelProperty(hidden = true)
    private List<ShpShop> shpShopList;
}
