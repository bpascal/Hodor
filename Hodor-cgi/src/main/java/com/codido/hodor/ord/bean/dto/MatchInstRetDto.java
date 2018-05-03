package com.codido.hodor.ord.bean.dto;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.ord.bean.vo.MatchInstVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 按彩种实例ID查询比赛信息列表的返回DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MatchInstRetDto extends BaseRetDto {

    /**
     * 比赛实例信息列表
     */
    private List<MatchInstVo> matchInstVoList;
}
