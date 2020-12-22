package com.codido.hodor.api.weixin.util;

import com.alibaba.fastjson.JSONObject;
import com.codido.hodor.core.common.util.JBUtil;
import com.codido.hodor.job.weixin.bean.dto.SNSUserInfo;
import com.codido.hodor.job.weixin.bean.outbean.WXSnsUserInfoRespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;

/**
 * 微信服务端请求util
 */
public class WeixinServerRequestUtil {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(WeixinServerRequestUtil.class);
    /**
     * 获取用户信息
     * @param accessToken
     * @param openId
     * @return
     */
    public static SNSUserInfo getSNSUserInfo(String accessToken, String openId) {
        SNSUserInfo snsUserInfo = null;
        // 拼接请求地址
        //String requestUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
        String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
        requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
        // 通过网页授权获取用户信息
        logger.debug("请求地址:"+requestUrl);
        String respStr = httpsRequest(requestUrl, "GET", null);
        WXSnsUserInfoRespBean snsUserInfoRespBean = JSONObject.parseObject(respStr.toString(), WXSnsUserInfoRespBean.class);
        if (!JBUtil.isStrEmpty(respStr)) {
            try {
                snsUserInfo = new SNSUserInfo();
                // 用户的标识
                snsUserInfo.setOpenId(snsUserInfoRespBean.getOpenid());
                // 昵称
                snsUserInfo.setNickname(snsUserInfoRespBean.getNickname());
                // 性别（1是男性，2是女性，0是未知）
                snsUserInfo.setSex(Integer.valueOf(snsUserInfoRespBean.getSex()));
                // 用户所在国家
                snsUserInfo.setCountry(snsUserInfoRespBean.getCountry());
                // 用户所在省份
                snsUserInfo.setProvince(snsUserInfoRespBean.getProvince());
                // 用户所在城市
                snsUserInfo.setCity(snsUserInfoRespBean.getCity());
                // 用户头像
                snsUserInfo.setHeadImgUrl(snsUserInfoRespBean.getHeadimgurl());
                // 用户unionid
                snsUserInfo.setUnionid(snsUserInfoRespBean.getUnionid());
                // 用户特权信息
                snsUserInfo.setPrivilegeList(snsUserInfoRespBean.getPrivilege());
            } catch (Exception e) {
                snsUserInfo = null;
                String errorCode = snsUserInfoRespBean.getErrcode();
                String errorMsg = snsUserInfoRespBean.getErrmsg();
                logger.debug("获取用户信息失败 errcode:{} errmsg:{}", errorCode, errorMsg);
            }
        }
        return snsUserInfo;
    }

    /**
     * 发送https请求
     *
     * @param requestUrl    请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr     提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static String httpsRequest(String requestUrl, String requestMethod, String outputStr) {
        String retStr = null;
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = {new MyX509TrustManager()};
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);

            // 当outputStr不为null时向输出流写数据
            if (null != outputStr) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }

            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }

            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            conn.disconnect();
            retStr = buffer.toString();
        } catch (ConnectException ce) {
            //log.error("连接超时：{}", ce);
        } catch (Exception e) {
            //log.error("https请求异常：{}", e);
        }
        return retStr;
    }


    /**
     * 方法名：httpRequest</br>
     * 详述：发送http请求</br>
     * 开发人员：souvc </br>
     * 创建时间：2016-1-5  </br>
     *
     * @param requestUrl
     * @param requestMethod
     * @param outputStr
     * @return 说明返回值含义
     */
    public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
        JSONObject jsonObject = null;
        StringBuffer buffer = new StringBuffer();
        try {
            TrustManager[] tm = {new MyX509TrustManager()};
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            URL url = new URL(requestUrl);
            HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();
            httpUrlConn.setSSLSocketFactory(ssf);
            httpUrlConn.setDoOutput(true);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);
            httpUrlConn.setRequestMethod(requestMethod);
            if ("GET".equalsIgnoreCase(requestMethod))
                httpUrlConn.connect();
            if (null != outputStr) {
                OutputStream outputStream = httpUrlConn.getOutputStream();
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }
            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            httpUrlConn.disconnect();
            jsonObject = JSONObject.parseObject(buffer.toString());
        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
