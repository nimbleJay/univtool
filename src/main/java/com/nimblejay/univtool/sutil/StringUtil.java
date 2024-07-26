package com.nimblejay.univtool.sutil;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: nimbleJay
 *  char校验工具类
 */
public final class StringUtil {

    /**
     * char类型校验为空
     *
     * @param cs 校验枚举码
     * @return boolean
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
    /**
     * char类型校验不为空
     *
     * @param cs
     * @return boolean
     */
    public static boolean isNotEmpty(CharSequence cs){
        return !isEmpty(cs);
    }

    /**
     * 判断给定的 String 数组是否为空。
     *
     * @param array 要检查的 String 数组
     * @return 如果数组为 null 或者长度为 0，则返回 true；否则返回 false
     */
    public static boolean isEmptyToArray(String[] array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断给定的 String 数组是否不为空。
     *
     * @param array 要检查的 String 数组
     * @return 如果数组不为 null 或者长度大于0，则返回 true；否则返回 false
     */
    public static boolean isNotEmptyToArray(String[] array) {
        return array != null && array.length > 0;
    }

    /**
     * 判断给定的对象是否为空。
     *
     * @param obj 要检查的对象
     * @return 如果对象为 null 或者是空字符串、空集合、空数组，则返回 true；否则返回 false
     */
    public static boolean isEmptyObject(Object obj) {
        // 对象为 null
        if (obj == null) {
            return true;
        }
        // 字符串为空
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        // 集合为空
        if (obj instanceof Collection) {
            return ((Collection<?>) obj).isEmpty();
        }
        // 映射为空
        if (obj instanceof Map) {
            return ((Map<?, ?>) obj).isEmpty();
        }
        // 数组为空
        if (obj.getClass().isArray()) {
            return java.lang.reflect.Array.getLength(obj) == 0;
        }
        // 其他情况，返回 false
        return false;
    }

    /**
     * 匹配是否相同
     *
     * @param cs1
     * @param cs2
     * @return boolean
     */
    public static boolean equals(CharSequence cs1, CharSequence cs2) {
        if (cs1 == cs2) {
            return true;
        } else if (cs1 != null && cs2 != null) {
            if (cs1.length() != cs2.length()) {
                return false;
            } else if (cs1 instanceof String && cs2 instanceof String) {
                return cs1.equals(cs2);
            } else {
                int length = cs1.length();

                for(int i = 0; i < length; ++i) {
                    if (cs1.charAt(i) != cs2.charAt(i)) {
                        return false;
                    }
                }

                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * 比较
     *
     * @param str1
     * @param str2
     * @return boolean
     */
    public static int compare(String str1, String str2) {
        return compare(str1, str2, true);
    }

    public static int compare(String str1, String str2, boolean nullIsLess) {
        if (str1 == str2) {
            return 0;
        } else if (str1 == null) {
            return nullIsLess ? -1 : 1;
        } else if (str2 == null) {
            return nullIsLess ? 1 : -1;
        } else {
            return str1.compareTo(str2);
        }
    }
}
