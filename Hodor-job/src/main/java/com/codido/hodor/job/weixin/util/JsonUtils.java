package com.codido.hodor.job.weixin.util;


import com.alibaba.fastjson.JSON;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public class JsonUtils {
  public static String toJson(Object obj) {
    return JSON.toJSONString(obj);
  }
}
