package com.codido.hodor.weixin.controller;

import com.codido.hodor.weixin.service.WxPlanetMpService;
import com.codido.hodor.weixin.service.WxZdjlMpService;
import io.swagger.annotations.Api;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Planet公众号后台提供给微信服务器的接口
 */
@RestController
@RequestMapping("/wechat_planet/portal")
@Api("Planet提供给微信服务的相关接口")
public class PlanetWechatController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WxPlanetMpService wxService;

    @GetMapping(produces = "text/plain;charset=utf-8")
    public String authGet(@RequestParam(name = "signature", required = false) String signature,
                          @RequestParam(name = "timestamp", required = false) String timestamp,
                          @RequestParam(name = "nonce", required = false) String nonce,
                          @RequestParam(name = "echostr", required = false) String echostr) {
        this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}, {}]", signature, timestamp, nonce, echostr);

        if (StringUtils.isAnyBlank(signature, timestamp, nonce, echostr)) {
            throw new IllegalArgumentException("请求参数非法，请核实!");
        }

        if (this.wxService.checkSignature(timestamp, nonce, signature)) {
            return echostr;
        }

        return "非法请求";
    }

    @PostMapping(produces = "application/xml; charset=UTF-8")
    public String post(@RequestBody String requestBody,
                       @RequestParam("signature") String signature,
                       @RequestParam("timestamp") String timestamp,
                       @RequestParam("nonce") String nonce,
                       @RequestParam(name = "encrypt_type", required = false) String encType,
                       @RequestParam(name = "msg_signature", required = false) String msgSignature) {
        this.logger.info("接收微信请求：[signature=[{}], encType=[{}], msgSignature=[{}]," + " timestamp=[{}], nonce=[{}], requestBody=[\n{}\n] ", signature, encType, msgSignature, timestamp, nonce, requestBody);

        if (!this.wxService.checkSignature(timestamp, nonce, signature)) {
            throw new IllegalArgumentException("非法请求，可能属于伪造的请求！");
        }

        String out = null;
        if (encType == null) {
            // 明文传输的消息
            WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
            this.logger.info("\n微信发过来的消息内容为：\n{} ", inMessage.toString());
            WxMpXmlOutMessage outMessage = this.route(inMessage);
            if (outMessage == null) {
                return "";
            }

            out = outMessage.toXml();
        } else if ("aes".equals(encType)) {
            // aes加密的消息
            WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(requestBody, this.wxService.getWxMpConfigStorage(), timestamp, nonce, msgSignature);
            this.logger.info("\n消息解密后内容为：\n{} ", inMessage.toString());
            WxMpXmlOutMessage outMessage = this.route(inMessage);
            if (outMessage == null) {
                return "";
            }

            out = outMessage.toEncryptedXml(this.wxService.getWxMpConfigStorage());
        }

        this.logger.debug("\n组装回复信息：{}", out);

        return out;
    }

    /**
     * 路由转发方法，根据业务类型转发
     *
     * @param message
     * @return
     */
    private WxMpXmlOutMessage route(WxMpXmlMessage message) {
        try {
            String myStr = message.getContent();
            String msg = "欢迎 OpenId:" + message.getFromUser() + ",来到我们的星球，从<a href='www.caishiduo.com'>这里</a>传送到你的星球去";
            return WxMpXmlOutMessage.TEXT().content(msg).fromUser(message.getToUser()).toUser(message.getFromUser()).build();

            //return wxService.route(message);
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
        }
        return null;
    }

}
