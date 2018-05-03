package com.codido.hodor.weixin.util;


import com.alibaba.fastjson.JSON;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public class JsonUtils {
  public static String toJsonString(Object obj) {
    return JSON.toJSONString(obj);
  }
}
