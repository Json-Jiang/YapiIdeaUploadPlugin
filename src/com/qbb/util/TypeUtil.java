package com.qbb.util;

/**
 * @author jiangjunshen
 * @date 11:13 AM 2019/8/22
 */
public class TypeUtil {
    
    public static String transform(String before) {
        String lower = before.toLowerCase();
        if ("long".equals(lower)
                || "bigdecimal".equals(lower)
                || "int".equals(lower)
                || "byte".equals(lower)
                || "short".equals(lower)
                || "double".equals(lower)
                || "float".equals(lower)) {
            return "number";
        }
        if ("date".equals(lower)
                || "char".equals(lower)) {
            return "string";
        }
        return lower;
    }
}
