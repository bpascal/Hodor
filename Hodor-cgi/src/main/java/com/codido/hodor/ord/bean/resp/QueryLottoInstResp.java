package com.codido.hodor.ord.bean.resp;

import com.codido.hodor.common.bean.resp.BaseResp;
import com.codido.hodor.ord.bean.vo.LottoInstVo;
import com.codido.hodor.ord.bean.vo.LottoVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询彩种期数实例响应类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class QueryLottoInstResp extends BaseResp {

    @ApiModelProperty("彩种期数实例")
    private LottoInstVo lottoInstVo;

    /**
     * 因为考虑到前端今后更加的灵活，故这次将彩种信息也通过后端传到前端
     * 具体的参数见LottoVo，数据可以根据ID写死，不做DB查询
     */
    @ApiModelProperty("彩种信息")
    private LottoVo lottoVo;
}
