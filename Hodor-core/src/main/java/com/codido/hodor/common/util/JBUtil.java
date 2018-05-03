package com.codido.hodor.common.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Formatter;
import java.util.List;

/**
 * 常用方法工具类
 * Created by bpascal on 2017/4/4.
 */
public class JBUtil {

    /**
     * 判断列表是否为空
     *
     * @param inList
     * @return
     */
    public static final boolean isListEmpty(List inList) {
        boolean retBool = false;
        if (inList != null && inList.size() > 0) {
            retBool = false;
        } else {
            retBool = true;
        }
        return retBool;
    }

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static final boolean isStrEmpty(String str) {
        boolean retBool = false;
        if (str != null && !"".equals(str.trim())) {
            retBool = false;
        } else {
            retBool = true;
        }
        return retBool;
    }

    /**
     * URL编码（utf-8）
     *
     * @param source
     * @return
     */
    public static String urlEncodeUTF8(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 方法名：byteToHex</br>
     * 详述：字符串加密辅助方法 </br>
     * 开发人员：laijj  </br>
     * 创建时间：2016-1-5  </br>
     *
     * @param hash
     * @return 说明返回值含义
     */
    public static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;

    }

    /**
     * double型字符转int
     *
     * @param string
     * @return
     */
    public static int stringToInt(String string) {
        String str = string.substring(0, string.indexOf(".")) + string.substring(string.indexOf(".") + 1);
        int intgeo = Integer.parseInt(str) / 100;
        return intgeo;
    }


    /**
     * 实际替换动作
     *
     * @param userName userName
     * @return
     */
    public static String replaceAction(String userName) {
        String userNameAfterReplaced = "";
        int nameLength = userName.length();
        if (nameLength < 3 && nameLength > 0) {
            if (nameLength == 1) {
                userNameAfterReplaced = "*";
            } else {
                userNameAfterReplaced = userName.replaceAll(userName, "^.{1,2}");
            }
        } else {
            Integer num1, num2, num3;
            num2 = (new Double(Math.ceil(new Double(nameLength) / 3))).intValue();
            num1 = (new Double(Math.floor(new Double(nameLength) / 3))).intValue();
            num3 = nameLength - num1 - num2;
            String star = StringUtils.repeat("*", num2);
            userNameAfterReplaced = userName.replaceAll("(.{" + num1 + "})(.{" + num2 + "})(.{" + num3 + "})", "$1" + star + "$3");
        }
        return userNameAfterReplaced;
    }

    /**
     * 获取IP地址
     *
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ipAddress = null;
        try {
            ipAddress = request.getHeader("x-forwarded-for");
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("Proxy-Client-IP");
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
                ipAddress = request.getRemoteAddr();
                if (ipAddress.equals("127.0.0.1")) {
                    // 根据网卡取本机配置的IP
                    InetAddress inet = null;
                    try {
                        inet = InetAddress.getLocalHost();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                    ipAddress = inet.getHostAddress();
                }
            }
            // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
            if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
                // = 15
                if (ipAddress.indexOf(",") > 0) {
                    ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
                }
            }
        } catch (Exception e) {
            ipAddress = "";
        }
        // ipAddress = this.getRequest().getRemoteAddr();

        return ipAddress;
    }
}
