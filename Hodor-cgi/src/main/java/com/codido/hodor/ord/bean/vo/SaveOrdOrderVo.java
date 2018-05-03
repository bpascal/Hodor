package com.codido.hodor.ord.bean.vo;

import com.codido.hodor.common.bean.dto.BaseRetDto;

public class SaveOrdOrderVo extends BaseRetDto {
    private OrderVo orderVo;

    public OrderVo getOrderVo() {
        return orderVo;
    }

    public void setOrderVo(OrderVo orderVo) {
        this.orderVo = orderVo;
    }
}