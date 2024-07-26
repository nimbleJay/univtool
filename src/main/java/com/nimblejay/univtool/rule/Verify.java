package com.nimblejay.univtool.rule;

import com.nimblejay.univtool.enums.EnumType;

/**
 *  正则校验类
 *
 */
public final class Verify {

    /**
     * 根据编码获取对应的枚举名
     *
     * @param code 校验枚举码
     * @return String
     */
   public static String getNameByCode(String code){
       return EnumType.getNameByCode(code);
   }

    /**
     * 根据给定的代码获取对应的枚举类型。
     *
     * @param code 要查找的枚举代码
     * @return 匹配的枚举类型，如果未找到则返回null
     */
    public static EnumType getEnumByCode(String code){
        return EnumType.getEnumByCode(code);
    }

    /**
     * 根据编码和要校验的内容，获取校验结果
     *
     * @param code 用于查找枚举的代码
     * @param str 需要匹配的字符串
     * @return 如果字符串匹配正则表达式，则返回true；否则返回false
     */
    public static boolean getResultByCode(String code,String str){
        return EnumType.getResultByCode(code,str);
    }

    /**
     * 根据编码获取正则表达式
     *
     * @param code 用于查找枚举的代码
     * @return 返回对应的正则表达式
     */
    public static String getRegexByCode(String code){
        return EnumType.getRegexByCode(code);
    }
}
