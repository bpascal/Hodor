package com.codido.hodor.ord.controller;

import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.mapper.LotMatchOPMapper;
import com.codido.hodor.mapper.LotMatchSqlProvider;
import com.codido.hodor.model.LotMatch;
import com.codido.hodor.ord.bean.dto.MatchInstRetDto;
import com.codido.hodor.ord.bean.req.*;
import com.codido.hodor.ord.bean.resp.*;
import com.codido.hodor.ord.bean.vo.MatchDateVo;
import com.codido.hodor.ord.bean.vo.MatchInstVo;
import com.codido.hodor.ord.bean.vo.MatchVo;
import com.codido.hodor.ord.service.LottoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/lot")
@Api(value = "彩种信息", description = "获取彩种及期数相关信息请求")
public class LottoController {

    /**
     * 日志工具
     */
    private static Logger logger = LoggerFactory.getLogger(LottoController.class);

    /**
     * 彩种相关service
     */
    private LottoService lottoService;

    /**
     * 比赛相关mapper
     */
    private LotMatchOPMapper lotMatchOPMapper;

    @Autowired
    public LottoController(LottoService lottoService) {
        this.lottoService = lottoService;
    }


    @ApiOperation(value = "获取彩种实例详情", notes = "根据传入的lottoId，即彩种ID，获取最新一期的彩种实例详情信息")
    @RequestMapping(value = "/queryLottoInst", method = RequestMethod.POST)
    public QueryLottoInstResp queryLottoInst(@RequestBody @ApiParam(value = "获取彩种实例信息请求对象", required = true) QueryLottoInstReq req) {
        return lottoService.queryLottoInst(req);
    }

    @ApiOperation(value = "获取各彩种最新的实例列表", notes = "获取当前时间下最新一期的彩种实例列表")
    @RequestMapping(value = "/queryNewestLottoInstList", method = RequestMethod.POST)
    public QueryNewestLottoInstListResp queryNewestLottoInstList(@RequestBody @ApiParam(value = "获取各彩种最新的实例列表请求对象", required = true) QueryNewestLottoInstListReq req) {
        return lottoService.queryNewestLottoInstList(req);
    }

    @ApiOperation(value = "开奖详情查询", notes = "根据彩种实例ID获取某一期开奖的详情")
    @RequestMapping(value = "/queryLottoInstBonusDetail", method = RequestMethod.POST)
    public QueryLottoInstBonusDetailResp queryLottoInstBonusDetail(@RequestBody @ApiParam(value = "获取某一期开奖详情请求对象", required = true) QueryLottoInstBonusDetailReq req) {
        return lottoService.queryLottoInstBonusDetail(req);
    }


    @ApiOperation(value = "某彩种开奖历史信息查询", notes = "根据彩种ID获取开奖历史情况，做分页处理")
    @RequestMapping(value = "/queryLottoInstBonusHisList", method = RequestMethod.POST)
    public QueryLottoInstBonusHisListResp queryLottoInstBonusHisList(@RequestBody @ApiParam(value = "获取某彩种开奖历史请求对象", required = true) QueryLottoInstBonusHisListReq req) {
        return lottoService.queryLottoInstBonusHisList(req);
    }

    @ApiOperation(value = "查询某彩种期数的比赛列表", notes = "查询某彩种期数的比赛列表")
    @RequestMapping(value = "/queryLottoInstMatchList", method = RequestMethod.POST)
    public QueryLottoInstMatchListResp queryLottoInstMatchList(@RequestBody @ApiParam(value = "查询某彩种期数的比赛列表请求对象", required = true) QueryLottoInstMatchListReq req) {
        QueryLottoInstMatchListResp resp = new QueryLottoInstMatchListResp();
        //彩种期数的比赛列表信息查询
        MatchInstRetDto matchInstRetDto = lottoService.queryLottoMatchesByLottoInstId(Long.valueOf(req.getLottoInstId()));
        if (matchInstRetDto.isHandlerResult()) {
            resp.setMatchInstVoList(matchInstRetDto.getMatchInstVoList());
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        } else {
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_LOTTOMATCH_ERROR);
            resp.setRespMsg(matchInstRetDto.getHandlerMsg());
        }
        return resp;
    }


    @ApiOperation(value = "查询日期列表", notes = "查询日期列表")
    @RequestMapping(value = "/queryDateList", method = RequestMethod.POST)
    public QueryDateListResp queryDateList(@RequestBody @ApiParam(value = "查询日期列表请求对象", required = true) QueryDateListReq req) {
        QueryDateListResp resp = new QueryDateListResp();
        //彩种期数的比赛列表信息查询
        resp.setMatchDateVoList(getCurrentMatchDateVoList());
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        return resp;
    }


    /**
     * 获取日期对象列表方法
     *
     * @return
     */
    private List<MatchDateVo> getCurrentMatchDateVoList() {
        List<MatchDateVo> matchDateVos = new ArrayList<>();
        Date currentDate = new Date();
        Date last2Date = JBDateUtil.addDate(-2);
        Date last1Date = JBDateUtil.addDate(-1);
        Date next1Date = JBDateUtil.addDate(+1);
        Date next2Date = JBDateUtil.addDate(+2);
        matchDateVos.add(new MatchDateVo(last2Date));
        matchDateVos.add(new MatchDateVo(last1Date));
        matchDateVos.add(new MatchDateVo(currentDate));
        matchDateVos.add(new MatchDateVo(next1Date));
        matchDateVos.add(new MatchDateVo(next2Date));
        return matchDateVos;
    }


    @ApiOperation(value = "查询比分直播的比赛列表", notes = "根据日期和比赛类型查询比赛列表")
    @RequestMapping(value = "/queryMatchList", method = RequestMethod.POST)
    public QueryMatchListResp queryMatchList(@RequestBody @ApiParam(value = "查询比赛列表请求对象", required = true) QueryMatchListReq req) {
        QueryMatchListResp resp = new QueryMatchListResp();
        //彩种期数的比赛列表信息查询
        List<MatchVo> matchVoList = lottoService.queryMatchList(req.getMatchType(), req.getMatchDate(), Long.valueOf(req.getPageNo()), Long.valueOf(req.getPrePageCount()));
        resp.setMatchVoList(matchVoList);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        return resp;
    }


    @ApiOperation(value = "查询竞彩受注比赛列表", notes = "查询竞彩受注比赛列表")
    @RequestMapping(value = "/querySportlotteryMatchList", method = RequestMethod.POST)
    public QuerySportlotteryMatchListResp querySportlotteryMatchList(@RequestBody @ApiParam(value = "查询竞彩受注比赛列表请求对象", required = true) QuerySportlotteryMatchListReq req) {
        QuerySportlotteryMatchListResp resp = new QuerySportlotteryMatchListResp();
        //竞彩受注比赛列表查询
        long pageNo = Long.valueOf(req.getPageNo());
        long prePageCount = Long.valueOf(req.getPrePageCount());
        List<MatchInstVo> matchInstVoList = lottoService.querySellingSportLottoMatchList(req.getLottoId(), pageNo, prePageCount);
        resp.setMatchInfoList(matchInstVoList);
        resp.setCurrentPageNo(req.getPageNo());
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        return resp;
    }

}
