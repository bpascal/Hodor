package com.codido.hodor.usr.bean.vo;

import com.codido.hodor.model.ShpShop;
import com.codido.hodor.ord.bean.vo.LottoInstVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 店铺对象
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopVo implements Serializable {

    /**
     * 无参数构造方法
     */
    public ShopVo() {
    }

    /**
     * 通过DB对象构造
     *
     * @param shpShop
     */
    public ShopVo(ShpShop shpShop) {
        this.shopId = shpShop.getShopId().toString();
        this.shopName = shpShop.getShopName();
        this.shopIconUrl = shpShop.getShopIconUrl();
        this.shopAddress=shpShop.getShopAddress();
        this.shopMblNo = shpShop.getShopMblNo();
        this.shopWxId = shpShop.getShopWxId();
        this.shopAlipayId = shpShop.getShopAlipayId();
        this.shopQrCode = shpShop.getShopQrcodeUrl();
        this.shopTradSts = shpShop.getShopTradSts();
        this.shopSts = shpShop.getShopSts();
        this.shopType = shpShop.getShopType();
    }


    @ApiModelProperty("店铺编号")
    private String shopId;

    @ApiModelProperty("店铺名称")
    private String shopName;

    @ApiModelProperty("店铺类型:D:双彩,T:体彩,F:福彩")
    private String shopType;

    @ApiModelProperty("店铺图标地址")
    private String shopIconUrl;

    @ApiModelProperty("店铺地址")
    private String shopAddress;

    @ApiModelProperty("店铺联系手机号")
    private String shopMblNo;

    @ApiModelProperty("店铺微信号")
    private String shopWxId;

    @ApiModelProperty("店铺支付宝账号")
    private String shopAlipayId;

    @ApiModelProperty("店铺进店码")
    private String shopQrCode;

    @ApiModelProperty("店铺经营状态:P:营业中,C:歇业中")
    private String shopTradSts;

    @ApiModelProperty("店铺状态:A:有效,N:失效,W:资料审核中")
    private String shopSts;

    @ApiModelProperty("店主姓名")
    private String shopManagerUserName;

    @ApiModelProperty("主推彩种实例")
    private LottoInstVo mainLottoInstVo;

    @ApiModelProperty("次要彩种实例")
    private LottoInstVo subLottoInstVo;

    @ApiModelProperty("可售彩种实例列表")
    private List<LottoInstVo> lottoInstVoList;
}
