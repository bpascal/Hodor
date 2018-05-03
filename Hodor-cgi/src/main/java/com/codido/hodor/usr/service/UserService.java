package com.codido.hodor.usr.service;

import com.alibaba.fastjson.JSON;
import com.codido.hodor.bo.AccountBo;
import com.codido.hodor.bo.dto.CreateAccountParaDto;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.dto.MessageXSendRetDto;
import com.codido.hodor.common.util.*;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.ord.bean.vo.AccountFlowVo;
import com.codido.hodor.ord.service.WxMpEventService;
import com.codido.hodor.usr.bean.dto.HandleUserShopRelaRetDto;
import com.codido.hodor.usr.bean.dto.QueryUserBankCardRetDto;
import com.codido.hodor.usr.bean.req.SubmitUserCardReq;
import com.codido.hodor.usr.bean.vo.*;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户相关service
 */
@Service
public class UserService {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    /**
     * 用户信息mapper
     */
    @Autowired
    private UsrUserMapper usrUserMapper;

    /**
     * 扩展的用户mapper
     */
    @Autowired
    private UsrUserOPMapper usrUserOPMapper;

    /**
     * 用户token的mapper
     */
    @Autowired
    private UsrTokenMapper usrTokenMapper;

    /**
     * 用户token的自定义mapper
     */
    @Autowired
    private UsrTokenOPMapper usrTokenOPMapper;

    /**
     * 店铺邀请码的ShpShopInviteCodeOPMapper
     */
    @Autowired
    private ShpShopInviteCodeOPMapper shpShopInviteCodeOPMapper;

    /**
     * 用户店铺关系自定义mapper
     */
    @Autowired
    private UsrShopRelaOPMapper usrShopRelaOPMapper;

    /**
     * 用户店铺关系主mapper
     */
    @Autowired
    private UsrShopRelaMapper usrShopRelaMapper;

    /**
     * 微信信息mapper
     */
    @Autowired
    private PubWxInfoMapper pubWxInfoMapper;

    /**
     * 用户账户明细mapper
     */
    @Autowired
    private AccUserAcdtOPMapper userAcdtOPMapper;


    /**
     * 用户账户mapper
     */
    @Autowired
    private AccUserAccountMapper userAccountMapper;

    /**
     * 短信验证码mapper
     */
    @Autowired
    private SmsCodeMapper smsCodeMapper;

    /**
     * 用户OPENID表mapper
     */
    @Autowired
    private UsrOpenIdOPMapper usrOpenIdOPMapper;

    /**
     * 用户的openId表mapper
     */
    @Autowired
    private UsrOpenIdMapper usrOpenIdMapper;
    /**
     * 用户的提现银行卡表mapper
     */
    @Autowired
    private UsrBankCardMapper usrBankCardMapper;

    /**
     * 用户绑定银行卡mapper
     */
    @Autowired
    private UsrBankCardOPMapper usrBankCardOPMapper;
    /**
     * 平台支持的银行卡表mapper
     */
    @Autowired
    private CmmBankMapper cmmBankMapper;

    /**
     * 用户账户处理
     */
    @Autowired
    private AccountBo accountBo;

    /**
     * 用户tag关系mapper
     */
    @Autowired
    private UsrTagsMapper usrTagsMapper;

    /**
     * 微信公众号服务
     */
    @Autowired
    private WxMpEventService wxMpEventService;

    /**
     * 获取用户数据测试方法
     *
     * @param userId
     * @return
     */
    public UserVo getUser(Long userId) {
        UsrUser users = usrUserMapper.selectByPrimaryKey(userId);

        UserVo user = new UserVo();
        user.setUserName(users.getUserNickname());
        user.setUserId(users.getUserId().toString());
        return user;
    }

    /**
     * 获取用户数据测试方法
     *
     * @param tokenId
     * @return
     */
    public UserVo getUserByToken(long tokenId) {
        UsrUser users = usrUserOPMapper.selectByTokenId(tokenId);
        UserVo user = null;
        if (users != null) {
            user = new UserVo();
            user.setUserName(users.getUserNickname());
            user.setUserId(users.getUserId().toString());
        }
        return user;
    }

    /**
     * 保存微信用户信息
     *
     * @param wxMpUser
     * @return
     */
    @Transactional
    public UserVo saveUserInfoByWeixinUserInfo(WxMpUser wxMpUser, String channelFlag) {
        //1.记录用户信息
        String openId = wxMpUser.getOpenId();//关注时获取到的openId
        if (JBUtil.isStrEmpty(channelFlag)) {
            //默认的渠道字段认为是彩士多公众号
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        UsrUser usrUser = usrUserOPMapper.selectByOpenId(openId, channelFlag);
        if (usrUser != null) {
            //根据openId找到了用户信息，需要更新
            //获取到用户信息，做更新用户信息的处理
            logger.debug("根据openId未找到用户信息，调用微信获取用户信息成功,snsUserInfo:" + wxMpUser.toString());
            usrUser.setUserCity(wxMpUser.getCity());
            usrUser.setUserCountry(wxMpUser.getCountry());
            usrUser.setUserHeadimgUrl(wxMpUser.getHeadImgUrl());
            usrUser.setUserNickname(wxMpUser.getNickname());
            usrUser.setUserProvince(wxMpUser.getProvince());
            usrUser.setUserSex(wxMpUser.getSexId() + "");
            usrUser.setUserWxNickname(wxMpUser.getNickname());
            usrUser.setUserWxUnionid(wxMpUser.getUnionId());
            usrUser.setUserWxOpenId(openId);
            usrUserMapper.updateByPrimaryKey(usrUser);
        } else {
            //根据openId没找到用户信息，先查用户unionid看是否有，如果有就更新，没有就新建
            //获取到用户信息，判断unionId是否有
            String unionId = wxMpUser.getUnionId();
            usrUser = usrUserOPMapper.selectByUnionId(unionId);
            if (usrUser != null) {
                //说明是老用户，做信息更新
                usrUser.setUserCity(wxMpUser.getCity());
                usrUser.setUserCountry(wxMpUser.getCountry());
                usrUser.setUserHeadimgUrl(wxMpUser.getHeadImgUrl());
                usrUser.setUserNickname(wxMpUser.getNickname());
                usrUser.setUserProvince(wxMpUser.getProvince());
                usrUser.setUserSex(wxMpUser.getSexId() + "");
                usrUser.setUserWxNickname(wxMpUser.getNickname());
                usrUser.setUserWxOpenId(openId);
                usrUserMapper.updateByPrimaryKey(usrUser);
            } else {
                //新用户，做插入
                usrUser = new UsrUser();
                usrUser.setUserCity(wxMpUser.getCity());
                usrUser.setUserCountry(wxMpUser.getCountry());
                usrUser.setUserHeadimgUrl(wxMpUser.getHeadImgUrl());
                usrUser.setUserNickname(wxMpUser.getNickname());
                usrUser.setUserProvince(wxMpUser.getProvince());
                usrUser.setUserSex(wxMpUser.getSexId() + "");
                usrUser.setUserWxNickname(wxMpUser.getNickname());
                usrUser.setUserCreateTime(new Date());
                usrUser.setUserWxUnionid(unionId);
                usrUser.setUserWxOpenId(openId);
                usrUser.setUserSts(CommonConstans.USER_STS_NOREALNAME);//默认是实名未认证
                //usrUser.setUserSource(LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);//默认是来源彩士多
                usrUser.setUserSource(channelFlag);//用户来源从前面传进来
                usrUser.setUserType(CommonConstans.USER_TYPE_PLAYER);//默认是彩民
                usrUserMapper.insert(usrUser);

                //新建账户信息
                CreateAccountParaDto createAccountParaDto = new CreateAccountParaDto();
                createAccountParaDto.setAmount(new Double(0));
                createAccountParaDto.setUserId(usrUser.getUserId());
                createAccountParaDto.setAccountOwnerType(CommonConstans.ACCOUNT_OWNER_TYPE_PLAYER);
                try {
                    accountBo.createUserAccount(createAccountParaDto);
                } catch (Exception e) {
                    logger.error("新建账户报错了:" + usrUser.getUserId());
                    e.printStackTrace();
                }
            }
        }
        //2.保存用户openId相关信息
        UsrOpenIdExample usrOpenIdExample = new UsrOpenIdExample();
        //usrOpenIdExample.createCriteria().andUserIdEqualTo(usrUser.getUserId()).andWxAppTypeEqualTo(LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);
        usrOpenIdExample.createCriteria().andUserIdEqualTo(usrUser.getUserId()).andWxAppTypeEqualTo(channelFlag);
        List<UsrOpenId> usrOpenIdList = usrOpenIdMapper.selectByExample(usrOpenIdExample);
        if (!JBUtil.isListEmpty(usrOpenIdList)) {
            //找到了，更新
            UsrOpenId usrOpenId = usrOpenIdList.get(0);
            usrOpenId.setWxOpenId(openId);
            usrOpenIdMapper.updateByPrimaryKey(usrOpenId);
        } else {
            //没找到，新增
            UsrOpenId usrOpenId = new UsrOpenId();
            usrOpenId.setWxOpenId(openId);
            usrOpenId.setUserId(usrUser.getUserId());
            //usrOpenId.setWxAppType(LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);
            usrOpenId.setWxAppType(channelFlag);
            usrOpenIdMapper.insert(usrOpenId);
        }

        //返回用户信息参数构造
        UserVo user = new UserVo(usrUser);

        return user;
    }

    /**
     * 根据openId保存用户信息
     *
     * @param openId
     * @return
     */
    @Transactional
    public UserVo saveUserInfoByOpenId(String openId, String channelFlag) {
        //0.初始化channelFlag
        if (JBUtil.isStrEmpty(channelFlag)) {
            //默认是彩士多公众号
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        //1.记录用户信息
        UsrUser usrUser = usrUserOPMapper.selectByOpenId(openId, channelFlag);
        if (usrUser != null) {
            logger.debug("根据openId找到用户信息，无需处理");
        } else {
            //根据openId没找到用户信息
            logger.debug("根据openId未找到用户信息，新建一个空用户");
            usrUser = new UsrUser();
            usrUser.setUserWxOpenId(openId);
            usrUser.setUserSts(CommonConstans.USER_STS_NOREALNAME);//未实名
            //usrUser.setUserSource(LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);//默认是来源彩士多
            usrUser.setUserSource(channelFlag);//用户来源是不同的渠道
            usrUser.setUserType(CommonConstans.USER_TYPE_PLAYER);//默认是彩民
            usrUserMapper.insert(usrUser);
        }
        //2.保存用户openId相关信息
        UsrOpenIdExample usrOpenIdExample = new UsrOpenIdExample();
        //usrOpenIdExample.createCriteria().andUserIdEqualTo(usrUser.getUserId()).andWxAppTypeEqualTo(LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);
        usrOpenIdExample.createCriteria().andUserIdEqualTo(usrUser.getUserId()).andWxAppTypeEqualTo(channelFlag);
        List<UsrOpenId> usrOpenIdList = usrOpenIdMapper.selectByExample(usrOpenIdExample);
        if (!JBUtil.isListEmpty(usrOpenIdList)) {
            //找到了，更新
            UsrOpenId usrOpenId = usrOpenIdList.get(0);
            usrOpenId.setWxOpenId(openId);
            usrOpenIdMapper.updateByPrimaryKey(usrOpenId);
        } else {
            //没找到，新增
            UsrOpenId usrOpenId = new UsrOpenId();
            usrOpenId.setWxOpenId(openId);
            usrOpenId.setUserId(usrUser.getUserId());
            //usrOpenId.setWxAppType(LottoStoreH5Constans.USER_REGIST_SOURCE_LOTTOSTORE);
            usrOpenId.setWxAppType(channelFlag);
            usrOpenIdMapper.insert(usrOpenId);
        }
        //返回用户信息参数构造
        UserVo user = new UserVo(usrUser);
        return user;
    }

    /**
     * 通过用户ID和商户邀请码处理用户商户关系
     *
     * @param userId
     * @param intiveCode
     */
    @Transactional
    public HandleUserShopRelaRetDto handleUserShopRela(String userId, String intiveCode) {
        HandleUserShopRelaRetDto retDto = new HandleUserShopRelaRetDto();
        //1.查询出这个店铺是什么店铺
        ShpShopInviteCodeWithShop shpShopInviteCode = shpShopInviteCodeOPMapper.selectShopByInviteCode(intiveCode);
        ShpShop shpShop = shpShopInviteCode.getShpShop();
        if (shpShop != null) {
            //找到店铺信息，查用户是否进入相同属性的店铺
            UsrShopRela usrShopRela = usrShopRelaOPMapper.selectByUserId(Long.valueOf(userId), shpShop.getShopType());
            if (usrShopRela != null) {
                //找到了
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("用户已加入店铺，暂不支持重复入相同店铺");
            } else {
                //未找到，可以入店
                usrShopRela = new UsrShopRela();
                usrShopRela.setShopId(shpShop.getShopId());
                usrShopRela.setShopType(shpShop.getShopType());
                usrShopRela.setUserId(Long.valueOf(userId));
                usrShopRela.setUsrShopRelaSort(0);//默认是0
                usrShopRela.setUsrShopRelaSts(CommonConstans.COMMON_STS_VALID);
                usrShopRelaMapper.insert(usrShopRela);
                ShopVo shopVo = new ShopVo(shpShop);
                retDto.setShopVo(shopVo);
                retDto.setHandlerResult(true);
                retDto.setHandlerMsg("您已成功加入店铺");
            }
        } else {
            //未找到店铺信息
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("未找到店铺信息");
        }
        return retDto;
    }

    /**
     * 根据OPENID获取用户信息，返回null则表示没获取到
     *
     * @param openId
     * @return
     */
    public UserVo queryUserInfoByOpenId(String openId, String channelFlag) {
        if (JBUtil.isStrEmpty(channelFlag)) {
            //默认是彩士多
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        UserVo userVo = null;
        UsrUser usrUser = usrUserOPMapper.selectByOpenId(openId, channelFlag);
        if (usrUser != null) {
            userVo = new UserVo(usrUser);
        }
        return userVo;
    }

    /**
     * 根据用户信息更新TOKEN
     *
     * @return
     */
    @Transactional
    public String handlerUserTokenRefresh(UserVo userVo) {
        String retTokenId = null;
        int updateCount = usrTokenOPMapper.updateTokenStsByUserId(Long.valueOf(userVo.getUserId()), CommonConstans.COMMON_STS_UNVALID);
        UsrToken usrToken = new UsrToken();
        usrToken.setUserId(Long.valueOf(userVo.getUserId()));
        usrToken.setTokenSts(CommonConstans.COMMON_STS_VALID);
        Date currentDate = new Date();
        usrToken.setTokenCreateTime(currentDate);
        usrToken.setTokenEndTime(JBDateUtil.addDate(LottoStoreH5Constans.TOKEN_EXP_DAYS));
        usrTokenMapper.insert(usrToken);
        retTokenId = usrToken.getTokenId().toString();
        return retTokenId;
    }


    /**
     * 保存用户实名信息
     *
     * @param usrUser
     * @param userRealNameVo
     * @return
     */
    @Transactional
    public BaseRetDto saveUserReadNameInfo(UsrUser usrUser, UserRealNameVo userRealNameVo, String channelFlag) {
        BaseRetDto retDto = new BaseRetDto();
        if (JBUtil.isStrEmpty(userRealNameVo.getUserRealName())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("用户姓名为空");
        } else if (JBUtil.isStrEmpty(userRealNameVo.getUserMblNo())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("用户手机号为空");
        } else if (userRealNameVo.getUserMblNo().length() != 11) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("用户手机号不正确");
        } else if (JBUtil.isStrEmpty(userRealNameVo.getUserIdCard())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("用户证件号为空");
        } else if (userRealNameVo.getUserIdCard().length() != 18) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("用户证件号不正确");
        } else if (JBUtil.isStrEmpty(userRealNameVo.getSmsCode())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("短信验证码为空");
        } else {
            //判断号码是否已经做过实名
            if (JBUtil.isStrEmpty(channelFlag)) {
                channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
            }
            UsrUser oldUser = usrUserOPMapper.selectByMblNoOrIdCard(userRealNameVo.getUserMblNo(), userRealNameVo.getUserIdCard(), channelFlag);
            if (oldUser != null) {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("当前身份信息已经进行实名认证，请确认身份");
            } else {
                if (usrUser == null) {
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("用户不存在");
                } else {
                    String phoneNum = userRealNameVo.getUserMblNo();
                    //检查短信验证码
                    SmsCodeExample smsCodeExample = new SmsCodeExample();
                    SmsCodeExample.Criteria criteria = smsCodeExample.createCriteria();
                    criteria.andMblNoEqualTo(phoneNum);
                    criteria.andSmsTypeEqualTo("BAND");
                    smsCodeExample.setOrderByClause("SMS_CODE_ID DESC");
                    List<SmsCode> smsCodeList = smsCodeMapper.selectByExample(smsCodeExample);
                    if (smsCodeList != null && smsCodeList.size() > 0) {
                        //获取最新验证码
                        SmsCode smsCode = smsCodeList.get(0);
                        if (!smsCode.getSmsCode().equals(userRealNameVo.getSmsCode())) {
                            retDto.setHandlerResult(false);
                            retDto.setHandlerMsg("短信验证码不正确");
                            return retDto;
                        }
                    } else {
                        retDto.setHandlerResult(false);
                        retDto.setHandlerMsg("您还未获取验证码");
                        return retDto;
                    }
                    usrUser.setUserRealname(userRealNameVo.getUserRealName());
                    usrUser.setUserMobile(userRealNameVo.getUserMblNo());
                    usrUser.setUserIdcard(userRealNameVo.getUserIdCard());
                    usrUser.setUserSts(CommonConstans.USER_STS_REALNAME_VALID);//实名已认证
                    usrUserMapper.updateByPrimaryKey(usrUser);
                    retDto.setHandlerResult(true);
                    retDto.setHandlerMsg("实名信息记录成功");
                }
            }
        }
        return retDto;
    }

    /**
     * 提交用户提现信息
     *
     * @param req
     * @return
     */
    @Transactional
    public BaseRetDto submitUserCard(SubmitUserCardReq req) {
        BaseRetDto retDto = new BaseRetDto();
        if (!req.getUsrUser().getUserSts().equals("A")) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("您还未实名，请先实名认证");
        } else if (JBUtil.isStrEmpty(req.getBankId())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("银行卡id为空");
        } else if (JBUtil.isStrEmpty(req.getCardNo())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("银行卡卡号为空");
        } else if (JBUtil.isStrEmpty(req.getUserName())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("卡户名为空");
        } else if (JBUtil.isStrEmpty(req.getSmsCode())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("短信验证码为空");
        } else {
            Long userId = req.getUsrUser().getUserId();
            UsrBankCardExample usrBankCardExample = new UsrBankCardExample();
            UsrBankCardExample.Criteria criteria = usrBankCardExample.createCriteria();
            criteria.andUserIdEqualTo(userId);
            criteria.andUsrBankcardStsEqualTo("A");
            List<UsrBankCard> usrBankCardList = usrBankCardMapper.selectByExample(usrBankCardExample);
            if (usrBankCardList != null && usrBankCardList.size() > 0) {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("您已经绑定过提现银行卡");
                return retDto;
            }
            String phoneNum = req.getUsrUser().getUserMobile();
            SmsCodeExample smsCodeExample = new SmsCodeExample();
            SmsCodeExample.Criteria smsCriteria = smsCodeExample.createCriteria();
            smsCriteria.andMblNoEqualTo(phoneNum);
            smsCriteria.andSmsTypeEqualTo("BINDCARD");
            smsCodeExample.setOrderByClause("SMS_CODE_ID DESC");
            List<SmsCode> smsCodeList = smsCodeMapper.selectByExample(smsCodeExample);
            if (smsCodeList != null && smsCodeList.size() > 0) {
                //获取最新验证码
                SmsCode smsCode = smsCodeList.get(0);
                if (!smsCode.getSmsCode().equals(req.getSmsCode())) {
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("短信验证码不正确");
                    return retDto;
                }
            } else {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("您还未获取验证码");
                return retDto;
            }
            UsrBankCard usrBankCard = new UsrBankCard();
            usrBankCard.setBandTime(new Date());
            usrBankCard.setBankCardNo(req.getCardNo());
            usrBankCard.setBankId(Long.parseLong(req.getBankId()));
            usrBankCard.setUserId(userId);
            usrBankCard.setUsrBankcardSts("A");
            usrBankCardMapper.insert(usrBankCard);
            retDto.setHandlerResult(true);
            retDto.setHandlerMsg("提交成功");
        }
        return retDto;
    }

    /**
     * 获取用户实名信息
     *
     * @param usrUser
     * @return
     */
    public UserRealNameVo getUserReadNameInfoByToken(UsrUser usrUser) {
        //UsrUser usrUser = usrUserOPMapper.selectByTokenId(tokenId);
        if (JBUtil.isStrEmpty(usrUser.getUserMobile()) || JBUtil.isStrEmpty(usrUser.getUserIdcard()) || JBUtil.isStrEmpty(usrUser.getUserRealname())) {
            return null;
        } else {
            return new UserRealNameVo(usrUser);
        }
    }

    /**
     * 获取平台支持的银行信息
     *
     * @return
     */
    public List<BankVo> queryPlatBankCardList() {
        List<CmmBank> cmmBankList = cmmBankMapper.selectByExample(new CmmBankExample());
        List<BankVo> bankVoList = new ArrayList<>();
        BankVo bankVo;
        for (CmmBank cmmBank : cmmBankList) {
            bankVo = new BankVo();
            bankVo.setBankId(cmmBank.getBankId() + "");
            bankVo.setBankLogoUrl(cmmBank.getBankLogoUrl());
            bankVo.setBankName(cmmBank.getBankName());
            bankVoList.add(bankVo);
        }
        return bankVoList;
    }


    /**
     * 查询用户交易流水列表
     *
     * @return
     */
    public List<AccountFlowVo> queryUserAccountFlow(Long userId, Long pageNo, Long pageCount) {
        List<AccUserAcdt> accUserAcdtList = userAcdtOPMapper.selectUserAcctFlowByUserId(userId, pageNo * pageCount, pageCount);
        List<AccountFlowVo> accountFlowVoList = new ArrayList<>();
        if (!JBUtil.isListEmpty(accUserAcdtList)) {
            for (AccUserAcdt accUserAcdt : accUserAcdtList) {
                accountFlowVoList.add(new AccountFlowVo(accUserAcdt));
            }
        }
        return accountFlowVoList;
    }


    /**
     * 申请短信验证码
     *
     * @param mblNo
     * @param type
     * @return
     */
    public BaseRetDto applySmsCode(String mblNo, String type, String channelFlag) {
        BaseRetDto retDto = new BaseRetDto();
        if ("LOGIN".equals(type)) {
            //商户登录
            UsrUserExample usrUserExample = new UsrUserExample();
            usrUserExample.createCriteria().andUserMobileEqualTo(mblNo);
            List<UsrUser> usrUserList = usrUserMapper.selectByExample(usrUserExample);
            if (JBUtil.isListEmpty(usrUserList)) {
                //没有这个号码，不可下发
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("请输入正确的号码");
                return retDto;
            }
        }

        int checkNo = (int) ((Math.random() * 9 + 1) * 100000);//生成随机数
        SmsCode smsCode = new SmsCode();
        smsCode.setMblNo(mblNo);
        smsCode.setSmsType(type);
        smsCode.setSmsCode(checkNo + "");
        smsCode.setSmsCodeCreateTime(new Date());
        smsCode.setSmsCodeSts(CommonConstans.SMS_CODE_STS_INIT);
        String signName = "【彩士多】";
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
            //彩士多公众号
            signName = "【彩士多】";
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
            //中大奖了公众号
            signName = "【彩量科技】";
        }
        String content = signName + "您的验证码是：" + checkNo + "，请在三分钟内完成验证";
        smsCode.setSmsContent(content);

        int result = smsCodeMapper.insert(smsCode);
        //通过创蓝发送
        //SmsSendResponse smsSendResponse = ChuangLanSmsSendUtil.sendSmsCode(mblNo, content);
        //logger.info("发送短信验证码完成,创蓝响应参数:" + smsSendResponse.toString());
        //smsCode.setLogId(smsSendResponse.getMsgId());
        //通过submail发送
        //根据不同的公众号入口加载不同的项目ID
        String projectId = "NWn6M3";
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
            //彩士多公众号
            projectId = "NWn6M3";
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
            //中大奖了公众号
            projectId = "uIaiE4";
        }

        String smsSendResponseJson = MessageXsendUtil.sendSubMailSms(projectId, mblNo, checkNo + "");
        logger.info("发送短信验证码完成,submail响应参数:" + smsSendResponseJson);
        MessageXSendRetDto retResponse = JSON.parseObject(smsSendResponseJson, MessageXSendRetDto.class);
        smsCode.setLogId(retResponse.getSend_id());
        smsCodeMapper.updateByPrimaryKey(smsCode);

        retDto.setHandlerResult(true);
        return retDto;
    }


    /**
     * 查询
     *
     * @param userId
     * @return
     */
    public String checkUserOpenId(Long userId, String appType) {
        String userOpenId = null;
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(userId, appType);
        if (usrOpenId != null) {
            userOpenId = usrOpenId.getWxOpenId();
        }
        return userOpenId;
    }

    /**
     * 保存用户的OPENID
     *
     * @param userId
     * @param appType
     * @param openId
     * @return
     */
    public BaseRetDto saveUserOpenId(Long userId, String appType, String openId) {
        BaseRetDto retDto = new BaseRetDto();
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(userId, appType);
        if (usrOpenId == null) {
            usrOpenId = new UsrOpenId();
            usrOpenId.setWxAppType(appType);
            usrOpenId.setUserId(userId);
            usrOpenId.setWxOpenId(openId);
            usrOpenId.setWxSessionKey(null);
            usrOpenIdMapper.insert(usrOpenId);
            retDto.setHandlerResult(true);
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("已经记录当前用户的OPENID");
        }
        return retDto;
    }


    /**
     * 查询用户账户信息详情
     *
     * @param userId
     * @return
     */
    public UserAccountDetailVo queryUserAccountDetail(Long userId) {
        UserAccountDetailVo retObj = new UserAccountDetailVo();
        AccUserAccountExample example = new AccUserAccountExample();
        example.createCriteria().andUserIdEqualTo(userId).andAccountStsEqualTo(CommonConstans.COMMON_STS_VALID);
        List<AccUserAccount> accUserAccountList = userAccountMapper.selectByExample(example);
        if (!JBUtil.isListEmpty(accUserAccountList)) {
            for (AccUserAccount accUserAccount : accUserAccountList) {
                if (CommonConstans.ACCOUNT_TYPE_ID_USEFUL.equals(accUserAccount.getAccountTypeId())) {
                    //可用余额
                    retObj.setUsefulBalance(accUserAccount.getAmount().toString());
                } else if (CommonConstans.ACCOUNT_TYPE_ID_BALANCE.equals(accUserAccount.getAccountTypeId())) {
                    //可提现余额
                    retObj.setWithdrawAbleBalance(accUserAccount.getAmount().toString());
                }
            }
        }
        return retObj;
    }

    /**
     * 查询用户的微信返回银行卡信息
     *
     * @param userId
     * @return
     */
    public QueryUserBankCardRetDto queryUserBankCard(Long userId) {
        QueryUserBankCardRetDto retDto = new QueryUserBankCardRetDto();
        UsrBankCardOP usrBankCardOP = usrBankCardOPMapper.selectByUserId(userId);
        if (usrBankCardOP != null) {
            BankCardVo bankCardVo = new BankCardVo();
            if (!JBUtil.isStrEmpty(usrBankCardOP.getBankCardNo())) {
                bankCardVo.setCardNo("尾号" + usrBankCardOP.getBankCardNo().substring(usrBankCardOP.getBankCardNo().length() - 4));
            }
            bankCardVo.setUserBankCardId(usrBankCardOP.getUsrBankcardId().toString());
            bankCardVo.setBankVo(new BankVo(usrBankCardOP.getCmmBank()));
            List<BankCardVo> bankCardVoList = new ArrayList<>();
            bankCardVoList.add(bankCardVo);
            retDto.setBankCardVoList(bankCardVoList);
            retDto.setHandlerResult(true);
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("未找到用户的银行卡信息");
        }
        return retDto;
    }

    /**
     * 给用户打tag方法
     *
     * @return
     */
    public BaseRetDto saveUserTags(Long userId, Long tagId, String userOpenId, String channelFlag) {
        BaseRetDto baseRetDto = new BaseRetDto();
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        //调用通用服务发送微信请求
        BaseRetDto saveUserTagsDto = wxMpEventService.saveUserTags(userId, tagId, userOpenId, channelFlag);
        if (saveUserTagsDto.isHandlerResult()) {
            //记录数据库用户tag
            UsrTagsExample usrTagsExample = new UsrTagsExample();
            usrTagsExample.createCriteria().andTagIdEqualTo(tagId).andUserIdEqualTo(userId).andUserTagStsEqualTo(CommonConstans.COMMON_STS_VALID);
            List<UsrTags> usrTagsList = usrTagsMapper.selectByExample(usrTagsExample);
            if (JBUtil.isListEmpty(usrTagsList)) {
                //列表为空，说明用户之前没这个tag，可以打，有了就不记了
                UsrTags usrTags = new UsrTags();
                usrTags.setTagId(tagId);
                usrTags.setUserId(userId);
                usrTags.setTagTime(new Date());
                usrTags.setUserTagSts(CommonConstans.COMMON_STS_VALID);
                usrTagsMapper.insert(usrTags);
            }
            baseRetDto.setHandlerResult(true);
        } else {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("调用微信服务发送请求失败");
        }
        return baseRetDto;
    }


    /**
     * 通知微信删除用户tag方法
     *
     * @return
     */
    public BaseRetDto deleteUserTags(Long userId, Long tagId, String userOpenId, String channelFlag) {
        BaseRetDto baseRetDto = new BaseRetDto();
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        //先发微信
        BaseRetDto saveUserTagsDto = wxMpEventService.deleteUserTags(userId, tagId, userOpenId, channelFlag);
        if (saveUserTagsDto.isHandlerResult()) {
            //记录数据库用户tag
            UsrTagsExample usrTagsExample = new UsrTagsExample();
            usrTagsExample.createCriteria().andTagIdEqualTo(tagId).andUserIdEqualTo(userId).andUserTagStsEqualTo(CommonConstans.COMMON_STS_VALID);
            List<UsrTags> usrTagsList = usrTagsMapper.selectByExample(usrTagsExample);
            if (JBUtil.isListEmpty(usrTagsList)) {
                //将原来的的tag改为失效
                for (UsrTags usrTags : usrTagsList) {
                    usrTags.setUserTagSts(CommonConstans.COMMON_STS_UNVALID);
                    usrTagsMapper.updateByPrimaryKey(usrTags);
                }
            }
            baseRetDto.setHandlerResult(true);
        } else {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("调用微信服务发送请求失败");
        }
        return baseRetDto;
    }
}
