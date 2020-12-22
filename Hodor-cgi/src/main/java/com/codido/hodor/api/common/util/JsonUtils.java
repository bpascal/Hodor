package com.codido.hodor.api.common.util;


import com.alibaba.fastjson.JSON;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public class JsonUtils<T> {
    public static String toJsonString(Object obj) {
        return JSON.toJSONString(obj);
    }
}
