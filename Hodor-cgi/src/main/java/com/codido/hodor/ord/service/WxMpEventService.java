package com.codido.hodor.ord.service;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.weixin.service.WxCsdMpService;
import com.codido.hodor.weixin.service.WxZdjlMpService;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * 专门的微信处理所需要使用的服务
 */
@Service
public class WxMpEventService {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(WxMpEventService.class);

    /**
     * 彩士多微信公众号服务
     */
    @Autowired
    private WxCsdMpService wxMpService;

    /**
     * 中大奖了公众号服务
     */
    @Autowired
    private WxZdjlMpService wxZdjlMpService;


    /**
     * 给用户打tag方法
     *
     * @return
     */
    public BaseRetDto saveUserTags(Long userId, Long tagId, String userOpenId, String channelFlag) {
        BaseRetDto baseRetDto = new BaseRetDto();
        //发微信
        try {
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                wxMpService.getUserTagService().batchTagging(tagId, new String[]{userOpenId});
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                wxZdjlMpService.getUserTagService().batchTagging(tagId, new String[]{userOpenId});
            }
            logger.info("给用户打微信标签成功");
            baseRetDto.setHandlerResult(true);
        } catch (WxErrorException e) {
            e.printStackTrace();
            baseRetDto.setHandlerResult(false);
        }
        return baseRetDto;
    }


    /**
     * 通知微信删除用户tag方法
     *
     * @param userId
     * @param tagId
     * @param userOpenId
     * @return
     */
    public BaseRetDto deleteUserTags(Long userId, Long tagId, String userOpenId, String channelFlag) {
        BaseRetDto baseRetDto = new BaseRetDto();
        try {
            //发微信
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                //彩士多公众号
                wxMpService.getUserTagService().batchUntagging(tagId, new String[]{userOpenId});
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                //中大奖了公众号
                wxZdjlMpService.getUserTagService().batchUntagging(tagId, new String[]{userOpenId});
            }
            logger.info("给用户打标签成功");
            baseRetDto.setHandlerResult(true);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        return baseRetDto;
    }


    /**
     * 通过微信下载文件
     *
     * @param channelFlag
     * @param imgWxMediaId
     * @return
     */
    public File downLoadWxMediaFile(String channelFlag, String imgWxMediaId) {
        File picFile = null;
        try {
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                //彩士多公众号
                picFile = wxMpService.getMaterialService().mediaDownload(imgWxMediaId);
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                //中大奖了公众号
                picFile = wxZdjlMpService.getMaterialService().mediaDownload(imgWxMediaId);
            }
        } catch (WxErrorException e) {
            e.printStackTrace();
            logger.error("获取微信的媒体文件失败");
        }
        return picFile;
    }
}
