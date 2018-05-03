package com.codido.hodor.ord.service;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.ord.bean.dto.MatchInstRetDto;
import com.codido.hodor.ord.bean.req.QueryLottoInstBonusDetailReq;
import com.codido.hodor.ord.bean.req.QueryLottoInstBonusHisListReq;
import com.codido.hodor.ord.bean.req.QueryLottoInstReq;
import com.codido.hodor.ord.bean.req.QueryNewestLottoInstListReq;
import com.codido.hodor.ord.bean.resp.QueryLottoInstBonusDetailResp;
import com.codido.hodor.ord.bean.resp.QueryLottoInstBonusHisListResp;
import com.codido.hodor.ord.bean.resp.QueryLottoInstResp;
import com.codido.hodor.ord.bean.resp.QueryNewestLottoInstListResp;
import com.codido.hodor.ord.bean.vo.*;
import com.codido.hodor.usr.bean.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 彩种信息相关service
 */
@Service
public class LottoService {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(LottoService.class);

    @Autowired
    private LotInstOPMapper lotInstOPMapper;

    @Autowired
    private LotLottoMapper lotLottoMapper;

    @Autowired
    private LotLottoBonusMapper lotLottoBonusMapper;

    @Autowired
    private LotInstBonusOPMapper lotInstBonusOPMapper;

    @Autowired
    private LotLottoBonusOPMapper lotLottoBonusOPMapper;

    @Autowired
    private LotInstMapper lotInstMapper;

    /**
     * 彩种自定义服务
     */
    @Autowired
    private LotLottoOPMapper lotLottoOPMapper;

    /**
     * 采种关注服务
     */
    @Autowired
    private UsrSubscriberLottoMapper subscriberLottoMapper;
    /**
     * 采种自定义关注服务
     */
    @Autowired
    private UsrSubscriberLottoOPMapper subscriberLottoOPMapper;

    /**
     * 彩票相关比赛信息查询mapper
     */
    @Autowired
    private LotInstMatchOPMapper lotInstMatchOPMapper;


    /**
     * 简单比赛信息查询mapper
     */
    @Autowired
    private LotMatchOPMapper lotMatchOPMapper;

    /**
     * 玩法实例mapper
     */
    @Autowired
    private MatchPlayInstOPMapper matchPlayInstOPMapper;

    /**
     * 玩法选项mapper
     */
    @Autowired
    private MatchPlayOddsOPMapper matchPlayOddsOPMapper;


    /**
     * 获取彩种实例详情
     *
     * @param req
     * @return
     */
    public QueryLottoInstResp queryLottoInst(QueryLottoInstReq req) {
        // 获取输入参数
        String lottoId = req.getLottoId();
        String tokenId = req.getTokenId();

        // 设置响应信息
        QueryLottoInstResp resp = new QueryLottoInstResp();

        // 查询彩种信息
        LotLotto lotLotto = lotLottoMapper.selectByPrimaryKey(Long.parseLong(lottoId));
        LottoVo lottoVo = new LottoVo();
        lottoVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
        lottoVo.setLottoId(lottoId);
        lottoVo.setLottoName(lotLotto.getLottoName());
        lottoVo.setLottoType(lotLotto.getLottoType());
        resp.setLottoVo(lottoVo);

        // 查询彩种在售期数信息
        LotInst lotInst = lotInstOPMapper.selectOnSellLotto(Long.parseLong(lottoId));
        if (null != lotInst) {
            LottoInstVo lottoInstVo = new LottoInstVo();
            BeanUtils.copyProperties(lotLotto, lottoInstVo);
            lottoInstVo.setLottoId(lottoId);
            lottoInstVo.setLottoBonusTime(JBDateUtil.convertDateToString(lotInst.getPeriodBonusTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            lottoInstVo.setLottoBonusTimeWeek(JBDateUtil.getWeekOfDate(lotInst.getPeriodBonusTime()));
            lottoInstVo.setLottoInstName(lotInst.getPeriodName());
            lottoInstVo.setLottoBonusNumber(lotInst.getPeriodBonusNumber());
            lottoInstVo.setLottoInstBeginTime(JBDateUtil.convertDateToString(lotInst.getPeriodBeginTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            lottoInstVo.setLottoInstId(lotInst.getLottoInstId() + "");
            lottoInstVo.setLottoInstEndTime(JBDateUtil.convertDateToString(lotInst.getPeriodEndTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            lottoInstVo.setLottoInstSts(lotInst.getPeriodSts());
            lottoInstVo.setLottoInstTagsName(lotInst.getPeriodTagsName());
            lottoInstVo.setLottoInstName(lotInst.getPeriodName());

            // 获取中奖信息
            List<LottoBonusInstVo> lottoBonusInstVoList = new ArrayList<>();
            List<LotInstBonus> lotInstBonuses = lotInstBonusOPMapper.selectByLottoInstId(lotInst.getLottoInstId());
            lotInstBonuses.forEach(lotInstBonus -> {
                LottoBonusInstVo vo = new LottoBonusInstVo();
                LotLottoBonus lotLottoBonus = lotLottoBonusOPMapper.selectByLottoId(Long.parseLong(lottoId), lotInstBonus.getBonusLevel());
                vo.setBonusCondition(lotLottoBonus.getLottoBonusDesc());
                vo.setBonusName(lotInstBonus.getBonusName());
                vo.setBonusCounts(lotInstBonus.getBonusCount());
                vo.setBonusAmt(lotInstBonus.getBonusPreAmt());
                vo.setBonusInstId(lotInstBonus.getLottoInstId() + "");
                lottoBonusInstVoList.add(vo);
            });
            lottoInstVo.setLottoBonusInstVoList(lottoBonusInstVoList);
            resp.setLottoInstVo(lottoInstVo);
            resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
            resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        }
        return resp;
    }

    /**
     * 查询各种彩票最近一期开奖信息
     *
     * @param req
     * @return
     */
    public QueryNewestLottoInstListResp queryNewestLottoInstList(QueryNewestLottoInstListReq req) {
        List<LotInstOP> lotInsts = lotInstOPMapper.selectInsts();

        // 设置响应信息
        QueryNewestLottoInstListResp resp = new QueryNewestLottoInstListResp();
        List<LottoInstVo> lottoInstVoList = new ArrayList<>();

        lotInsts.forEach(lotInst -> {
            LottoInstVo lottoInstVo = new LottoInstVo();
            Long lottoInstId = lotInst.getLottoInstId();
            LotInst moreLotInst = lotInstMapper.selectByPrimaryKey(lottoInstId);
            LotLotto lotLotto = lotLottoMapper.selectByPrimaryKey(lotInst.getLottoId());
            lottoInstVo.setLottoId(lotInst.getLottoId() + "");
            lottoInstVo.setLottoType(lotLotto.getLottoType());
            lottoInstVo.setLottoBonusTime(JBDateUtil.convertDateToString(moreLotInst.getPeriodBonusTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            lottoInstVo.setLottoBonusTimeWeek(JBDateUtil.getWeekOfDate(moreLotInst.getPeriodBonusTime()));
            lottoInstVo.setLottoInstName(moreLotInst.getPeriodName());
            lottoInstVo.setLottoBonusNumber(moreLotInst.getPeriodBonusNumber());
            lottoInstVo.setLottoInstBeginTime(JBDateUtil.convertDateToString(moreLotInst.getPeriodBeginTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            lottoInstVo.setLottoInstId(moreLotInst.getLottoInstId() + "");
            lottoInstVo.setLottoInstEndTime(JBDateUtil.convertDateToString(moreLotInst.getPeriodEndTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            lottoInstVo.setLottoInstSts(moreLotInst.getPeriodSts());
            lottoInstVo.setLottoInstTagsName(moreLotInst.getPeriodTagsName());
            lottoInstVo.setLottoInstName(moreLotInst.getPeriodName());
            lottoInstVo.setLottoName(lotLotto.getLottoName());
            lottoInstVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
            lottoInstVo.setLottoInstTags(moreLotInst.getPeriodTags());

            // 获取中奖信息
            List<LottoBonusInstVo> lottoBonusInstVoList = new ArrayList<>();
            List<LotInstBonus> lotInstBonuses = lotInstBonusOPMapper.selectByLottoInstId(lotInst.getLottoInstId());
            lotInstBonuses.forEach(lotInstBonus -> {
                LottoBonusInstVo vo = new LottoBonusInstVo();
                LotLottoBonus lotLottoBonus = lotLottoBonusOPMapper.selectByLottoId(lotInst.getLottoId(), lotInstBonus.getBonusLevel());
                vo.setBonusCondition(lotLottoBonus.getLottoBonusDesc());
                vo.setBonusName(lotInstBonus.getBonusName());
                vo.setBonusCounts(lotInstBonus.getBonusCount());
                vo.setBonusAmt(lotInstBonus.getBonusPreAmt());
                vo.setBonusInstId(lotInstBonus.getLottoInstId() + "");
                lottoBonusInstVoList.add(vo);
            });
            lottoInstVo.setLottoBonusInstVoList(lottoBonusInstVoList);

            lottoInstVoList.add(lottoInstVo);
        });
        resp.setLottoInstVoList(lottoInstVoList);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    /**
     * 开奖详情查询
     *
     * @param req
     * @return
     */
    public QueryLottoInstBonusDetailResp queryLottoInstBonusDetail(QueryLottoInstBonusDetailReq req) {
        // 获取输入参数
        String lottoInstId = req.getLottoInstId();

        // 设置响应参数
        QueryLottoInstBonusDetailResp resp = new QueryLottoInstBonusDetailResp();
        LotInst moreLotInst = lotInstMapper.selectByPrimaryKey(Long.parseLong(lottoInstId));
        LotLotto lotLotto = lotLottoMapper.selectByPrimaryKey(moreLotInst.getLottoId());

        LottoInstVo lottoInstVo = new LottoInstVo();
        lottoInstVo.setLottoId(moreLotInst.getLottoId() + "");
        lottoInstVo.setTotalSellAmt(moreLotInst.getPeriodTotalSell());
        lottoInstVo.setTotalBonusAmt(moreLotInst.getPeriodTotalBonus());
        lottoInstVo.setLottoType(lotLotto.getLottoType());
        lottoInstVo.setLottoBonusTime(JBDateUtil.convertDateToString(moreLotInst.getPeriodBonusTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
        lottoInstVo.setLottoBonusTimeWeek(JBDateUtil.getWeekOfDate(moreLotInst.getPeriodBonusTime()));
        lottoInstVo.setLottoInstName(moreLotInst.getPeriodName());
        lottoInstVo.setLottoBonusNumber(moreLotInst.getPeriodBonusNumber());
        lottoInstVo.setLottoInstBeginTime(JBDateUtil.convertDateToString(moreLotInst.getPeriodBeginTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
        lottoInstVo.setLottoInstId(moreLotInst.getLottoInstId() + "");
        lottoInstVo.setLottoInstEndTime(JBDateUtil.convertDateToString(moreLotInst.getPeriodEndTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
        lottoInstVo.setLottoInstSts(moreLotInst.getPeriodSts());
        lottoInstVo.setLottoInstTagsName(moreLotInst.getPeriodTagsName());
        lottoInstVo.setLottoInstName(moreLotInst.getPeriodName());
        lottoInstVo.setLottoName(lotLotto.getLottoName());
        lottoInstVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
        lottoInstVo.setLottoInstTags(moreLotInst.getPeriodTags());

        // 获取中奖信息
        List<LottoBonusInstVo> lottoBonusInstVoList = new ArrayList<>();
        List<LotInstBonus> lotInstBonuses = lotInstBonusOPMapper.selectByLottoInstId(Long.parseLong(lottoInstId));
        lotInstBonuses.forEach(lotInstBonus -> {
            LottoBonusInstVo vo = new LottoBonusInstVo();
            LotLottoBonus lotLottoBonus = lotLottoBonusOPMapper.selectByLottoId(lotLotto.getLottoId(), lotInstBonus.getBonusLevel());
            vo.setBonusCondition(lotLottoBonus.getLottoBonusDesc());
            vo.setBonusName(lotInstBonus.getBonusName());
            vo.setBonusCounts(lotInstBonus.getBonusCount());
            vo.setBonusAmt(lotInstBonus.getBonusPreAmt());
            vo.setBonusInstId(lotInstBonus.getLottoInstId() + "");
            lottoBonusInstVoList.add(vo);
        });
        lottoInstVo.setLottoBonusInstVoList(lottoBonusInstVoList);

        resp.setLottoInstVo(lottoInstVo);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        return resp;
    }

    /**
     * 某彩种开奖历史信息查询
     *
     * @param req
     * @return
     */
    public QueryLottoInstBonusHisListResp queryLottoInstBonusHisList(QueryLottoInstBonusHisListReq req) {
        // 获取彩种编号
        String lottoId = req.getLottoId();
        String pageNo = req.getPageNo();
        String prePageCount = req.getPrePageCount();


        // 获取彩种信息
        LotLotto lotLotto = lotLottoMapper.selectByPrimaryKey(Long.parseLong(lottoId));

        // 设置响应信息
        QueryLottoInstBonusHisListResp resp = new QueryLottoInstBonusHisListResp();
        List<LottoInstVo> lottoInstVoList = new ArrayList<>();

        // 查询最近20期彩票记录
        int NO = pageNo == null || "".equals(pageNo) ? 1 : Integer.parseInt(pageNo);
        NO = NO > 0 ? NO : 1;
        int count = prePageCount == null || "".equals(prePageCount) ? 10 : Integer.parseInt(prePageCount);
        count = count > 0 ? count : 10;

        int startNum = (NO - 1) * count;
        List<LotInst> lotInsts = lotInstOPMapper.selectHistoryInsts(Long.parseLong(lottoId), startNum, count);
        lotInsts.forEach(lotInst -> {
            LottoInstVo vo = new LottoInstVo();
            vo.setLottoId(lotInst.getLottoId() + "");
            vo.setLottoBonusTime(JBDateUtil.convertDateToString(lotInst.getPeriodBonusTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            vo.setLottoBonusTimeWeek(JBDateUtil.getWeekOfDate(lotInst.getPeriodBonusTime()));
            vo.setLottoInstName(lotInst.getPeriodName());
            vo.setLottoBonusNumber(lotInst.getPeriodBonusNumber());
            vo.setLottoInstBeginTime(JBDateUtil.convertDateToString(lotInst.getPeriodBeginTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            vo.setLottoInstId(lotInst.getLottoInstId() + "");
            vo.setLottoInstEndTime(JBDateUtil.convertDateToString(lotInst.getPeriodEndTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
            vo.setLottoInstSts(lotInst.getPeriodSts());
            vo.setLottoInstTagsName(lotInst.getPeriodTagsName());
            vo.setLottoInstName(lotInst.getPeriodName());
            vo.setLottoName(lotLotto.getLottoName());
            vo.setLottoIconUrl(lotLotto.getLottoIconUrl());
            vo.setLottoInstTags(lotInst.getPeriodTags());
            lottoInstVoList.add(vo);
        });

        resp.setLottoInstVoList(lottoInstVoList);
        resp.setRespCode(LottoStoreH5Constans.RESP_CODE_SUCCESS);
        resp.setRespMsg(LottoStoreH5Constans.RESP_MSG_SUCCESS);
        resp.setCurrentPageNo(NO + "");
        return resp;
    }

    /**
     * 关注采种
     *
     * @param userId
     * @param lottoId
     */
    public void follow(long userId, long lottoId) {
        UsrSubscriberLotto usrSubscriberLotto = subscriberLottoOPMapper.selectByUserIdAndLottoId(userId, lottoId);
        if (usrSubscriberLotto == null) {
            usrSubscriberLotto = new UsrSubscriberLotto();
            usrSubscriberLotto.setLottoId(lottoId);
            usrSubscriberLotto.setUserId(userId);
            usrSubscriberLotto.setSubscribSts("A");
            usrSubscriberLotto.setSubscribTme(new Date());
            subscriberLottoMapper.insert(usrSubscriberLotto);
        } else {
            usrSubscriberLotto.setSubscribSts("A");
            usrSubscriberLotto.setSubscribTme(new Date());
            subscriberLottoMapper.updateByPrimaryKey(usrSubscriberLotto);
        }
    }

    /**
     * 取消关注
     *
     * @param userId
     * @param lottoId
     */
    public BaseRetDto unfollow(long userId, long lottoId) {
        BaseRetDto baseRetDto = new BaseRetDto();
        UsrSubscriberLotto usrSubscriberLotto = subscriberLottoOPMapper.selectByUserIdAndLottoId(userId, lottoId);
        if (usrSubscriberLotto != null) {
            usrSubscriberLotto.setSubscribSts("N");
            usrSubscriberLotto.setUnsubscribTme(new Date());
            subscriberLottoMapper.updateByPrimaryKey(usrSubscriberLotto);
            baseRetDto.setHandlerResult(true);
            baseRetDto.setHandlerMsg("已取消关注");
        } else {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("未曾关注改采种");
        }
        return baseRetDto;
    }


    /**
     * 获取用户关注的采种
     *
     * @param userId
     * @return
     */
    public List<UserSubscriberLottoVo> getUserSubscriberLottoList(long userId) {

        List<UserSubscriberLottoVo> userSubscriberLottoVoList = new ArrayList<>();
        //先查询所有的
        LotLottoExample lotLottoExample = new LotLottoExample();
        List<String> showLottoTypes = new ArrayList<>();
        showLottoTypes.add(CommonConstans.LOTTO_TYPE_FC_NUM);
        showLottoTypes.add(CommonConstans.LOTTO_TYPE_TC_NUM);
        showLottoTypes.add(CommonConstans.LOTTO_TYPE_TC_CT);
        lotLottoExample.createCriteria().andLottoStsEqualTo(CommonConstans.COMMON_STS_VALID).andLottoTypeIn(showLottoTypes);
        List<LotLotto> retLottoList = lotLottoMapper.selectByExample(lotLottoExample);

        //再查询用户已经关注的
        List<LotLotto> lotLottoEffectList = lotLottoOPMapper.selectEffectByUserId(userId);

        retLottoList.forEach(lotto -> {
            //构建彩种基本信息
            LottoVo lottoVo = new LottoVo();
            lottoVo.setLottoIconUrl(lotto.getLottoIconUrl());
            lottoVo.setLottoId(lotto.getLottoId().toString());
            lottoVo.setLottoName(lotto.getLottoName());
            lottoVo.setLottoType(lotto.getLottoType());

            boolean userSubSts = false;
            if (!JBUtil.isListEmpty(lotLottoEffectList)) {
                int lotLottoEffectListSize = lotLottoEffectList.size();
                for (int i = 0; i < lotLottoEffectListSize; i++) {
                    LotLotto lotLotto = lotLottoEffectList.get(i);
                    if (lotLotto.getLottoId().equals(lotto.getLottoId())) {
                        userSubSts = true;
                        break;
                    }
                }
            }
            //构建用户关注的彩种信息(用户没关注也返回这个，只是关注状态为false)
            UserSubscriberLottoVo userSubscriberLottoVo = new UserSubscriberLottoVo();
            userSubscriberLottoVo.setUserId(String.valueOf(userId));
            userSubscriberLottoVo.setSubscriberSts(userSubSts);
            userSubscriberLottoVo.setLottoVo(lottoVo);

            userSubscriberLottoVoList.add(userSubscriberLottoVo);
        });

        return userSubscriberLottoVoList;
    }

    /**
     * 根据订单实例ID查询
     *
     * @param lottoInstId
     * @return
     */
    public MatchInstRetDto queryLottoMatchesByLottoInstId(Long lottoInstId) {
        MatchInstRetDto matchInstRetDto = new MatchInstRetDto();
        List<MatchInstVo> matchInstVoList = new ArrayList<>();
        List<LotInstMatchOP> lotInstMatchList = lotInstMatchOPMapper.selectByLotInstId(lottoInstId);
        if (!JBUtil.isListEmpty(lotInstMatchList)) {
            for (LotInstMatchOP lotInstMatch : lotInstMatchList) {
                MatchInstVo matchInstVo = new MatchInstVo(lotInstMatch);
                matchInstVoList.add(matchInstVo);
            }
        }
        //返回结果
        matchInstRetDto.setHandlerResult(true);
        matchInstRetDto.setMatchInstVoList(matchInstVoList);
        return matchInstRetDto;
    }

    /**
     * 查询比赛列表
     *
     * @param matchType
     * @param matchDate
     * @param pageNo
     * @param prePageCount
     * @return
     */
    public List<MatchVo> queryMatchList(String matchType, String matchDate, Long pageNo, Long prePageCount) {
        List<MatchVo> retList = new ArrayList<>();
        List<LotMatchOP> lotMatchList = lotMatchOPMapper.selectByMatchDateAndType(matchType, matchDate, pageNo * prePageCount, prePageCount);
        if (!JBUtil.isListEmpty(lotMatchList)) {
            for (LotMatchOP lotMatchOP : lotMatchList) {
                retList.add(new MatchVo(lotMatchOP));
            }
        }
        return retList;
    }

    /**
     * 分页查询正在销售的竞彩比赛列表
     *
     * @param pageNo
     * @param prePageCount
     * @return
     */
    public List<MatchInstVo> querySellingSportLottoMatchList(String lottoId, long pageNo, long prePageCount) {
        //分页查询正在销售的竞彩比赛列表
        List<MatchInstVo> retList = new ArrayList<>();
        String matchType = CommonConstans.MATCH_TYPE_SOCCER;
        if (CommonConstans.LOTTO_ID_JCZQ.equals(lottoId)) {
            matchType = CommonConstans.MATCH_TYPE_SOCCER;
        } else if (CommonConstans.LOTTO_ID_JCLQ.equals(lottoId)) {
            matchType = CommonConstans.MATCH_TYPE_BASKETBALL;
        }

//        int NO = pageNo == null || "".equals(pageNo) ? 1 : Integer.parseInt(pageNo);
//        NO = NO > 0 ? NO : 1;
//        int count = prePageCount == null || "".equals(prePageCount) ? 10 : Integer.parseInt(prePageCount);
//        count = count > 0 ? count : 10;
//
//        int startNum = (NO - 1) * count;
        List<LotMatchOP> matchInfoList = lotMatchOPMapper.selectMatchListByMatchType(lottoId, pageNo * prePageCount, prePageCount);
        if (!JBUtil.isListEmpty(matchInfoList)) {
            for (LotMatchOP lotMatch : matchInfoList) {
                MatchInstVo matchInstVo = new MatchInstVo(lotMatch);
                //比赛的玩法列表
                List<MatchPlayInst> matchPlayInstList = matchPlayInstOPMapper.selectByMatchInfoId(lotMatch.getMatchInfoId());
                if (!JBUtil.isListEmpty(matchPlayInstList)) {
                    List<MatchLottoMethodVo> matchLottoMethodVoList = new ArrayList<>();
                    for (MatchPlayInst matchPlayInst : matchPlayInstList) {
                        MatchLottoMethodVo matchLottoMethodVo = new MatchLottoMethodVo();
                        matchLottoMethodVo.setLottoMethodInstId(matchPlayInst.getMatchPlayInstId().toString());
                        matchLottoMethodVo.setLottoMethodId(matchPlayInst.getMatchPlayId().toString());
                        matchLottoMethodVo.setLottoMethodName(matchPlayInst.getMatchPlayName());
                        matchLottoMethodVo.setLottoMethodParamValue(matchPlayInst.getMatchPlayParam());
                        matchLottoMethodVo.setLottoMethodSts(matchPlayInst.getMatchPlaySts());
                        matchLottoMethodVo.setLottoMethodCreateTime(JBDateUtil.transDate2String(matchPlayInst.getMatchPlayCreateTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
                        matchLottoMethodVo.setLottoMethodMinCount(matchPlayInst.getMatchPlayMinCount() == null ? "0" : matchPlayInst.getMatchPlayMinCount().toString());
                        matchLottoMethodVo.setLottoMethodMaxCount(matchPlayInst.getMatchPlayMaxCount() == null ? "0" : (matchPlayInst.getMatchPlayMinCount() == 0 ? "0" : matchPlayInst.getMatchPlayMaxCount().toString()));
                        matchLottoMethodVo.setLottoMethodSellingFlag(matchPlayInst.getMatchPlaySellingFlag());
                        matchLottoMethodVo.setLottoMethodResultOddsCode(matchPlayInst.getMatchResultOddsCode());

                        //补充比赛的玩法选项列表
                        List<MatchPlayOdds> matchPlayOddsList = matchPlayOddsOPMapper.selectByPlayInstId(matchPlayInst.getMatchPlayInstId());
                        if (!JBUtil.isListEmpty(matchPlayOddsList)) {
                            List<MatchLottoMethodOddsVo> matchLottoMethodOddsVoList = new ArrayList<>();
                            for (MatchPlayOdds matchPlayOdds : matchPlayOddsList) {
                                MatchLottoMethodOddsVo matchLottoMethodOddsVo = new MatchLottoMethodOddsVo();
                                matchLottoMethodOddsVo.setOddsId(matchPlayOdds.getOddsId().toString());
                                matchLottoMethodOddsVo.setOddsCode(matchPlayOdds.getOddsCode());
                                matchLottoMethodOddsVo.setOddsName(matchPlayOdds.getOddsName());
                                matchLottoMethodOddsVo.setOddsParamName(matchPlayOdds.getOddsParamName());
                                matchLottoMethodOddsVo.setOddsParamValue(matchPlayOdds.getOddsParamValue());
                                matchLottoMethodOddsVo.setOddsValue(matchPlayOdds.getOddsValue().toString());
                                matchLottoMethodOddsVo.setOddsSts(matchPlayOdds.getOddsSts());
                                matchLottoMethodOddsVo.setOddsTrend(matchPlayOdds.getOddsTrend());
                                matchLottoMethodOddsVo.setOddsCreateTime(JBDateUtil.transDate2String(matchPlayOdds.getOddsCreateTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
                                matchLottoMethodOddsVoList.add(matchLottoMethodOddsVo);
                            }
                            matchLottoMethodVo.setMatchLottoMethodOddsVoList(matchLottoMethodOddsVoList);
                        }
                        matchLottoMethodVoList.add(matchLottoMethodVo);
                    }
                    matchInstVo.setMatchLottoMethodVoList(matchLottoMethodVoList);
                }
                retList.add(matchInstVo);
            }
        }
        return retList;
    }
}
