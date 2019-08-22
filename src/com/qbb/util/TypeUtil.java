package com.qbb.util;

/**
 * @author jiangjunshen
 * @date 11:13 AM 2019/8/22
 */
public class TypeUtil {
    
    public static String transform(String before) {
        String lower = before.toLowerCase();
        if ("long".equals(lower)) {
            return "number";
        }
        return lower;
    }
}
