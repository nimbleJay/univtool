package com.nimblejay.univtool.sutil;
import java.util.*;

/**
 *  集合非空校验类
 *
 */
public final class CollectionUtil {

    /**
     * 判断给定的 List 是否为空。
     *
     * @param list 要检查的 List
     * @param <T>  List 中的元素类型
     * @return 如果 List 为 null 或者为空，则返回 true；否则返回 false
     */
    public static <T> boolean isEmptyToList(List<? extends T> list) {
        return list == null || list.isEmpty();
    }

    /**
     * 判断给定的 List 是否不为空。
     *
     * @param list 要检查的 List
     * @param <T>  List 中的元素类型
     * @return 如果 List 不为 null 或者不为空，则返回 true；否则返回 false
     */
    public static <T> boolean isNotEmptyToList(List<T> list) {
        return list != null && !list.isEmpty();
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
     * 判断给定的 Set 是否为空。
     *
     * @param set 要检查的 Set
     * @param <T> Set 中的元素类型
     * @return 如果 Set 为 null 或者为空，则返回 true；否则返回 false
     */
    public static <T> boolean isEmptyToSet(Set<T> set) {
        return set == null || set.isEmpty();
    }

    /**
     * 判断给定的 Set 是否不为空。
     *
     * @param set 要检查的 Set
     * @param <T> Set 中的元素类型
     * @return 如果 Set 不为 null 或者不为空，则返回 true；否则返回 false
     */
    public static <T> boolean isNotEmptyToSet(Set<T> set) {
        return set != null && !set.isEmpty();
    }

    /**
     * 判断给定的 Map 是否为空。
     *
     * @param map 要检查的 Map
     * @param <K> Map 中的键的类型
     * @param <V> Map 中的值的类型
     * @return 如果 Map 为 null 或者为空，则返回 true；否则返回 false
     */
    public static <K, V> boolean isEmptyToMap(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    /**
     * 判断给定的 Map 是否不为空。
     *
     * @param map 要检查的 Map
     * @param <K> Map 中的键的类型
     * @param <V> Map 中的值的类型
     * @return 如果 Map 不为 null 或者不为空，则返回 true；否则返回 false
     */
    public static <K, V> boolean isNotEmptyToMap(Map<K, V> map) {
        return map != null && !map.isEmpty();
    }

    /**
     * 创建并返回一个新的 List，包含源 List 的所有元素。
     *
     * @param source 源 List
     * @param <T>    List 中的元素类型
     * @return 新的 List，包含源 List 的所有元素
     */
    public static <T> List<T> copyList(List<T> source) {
        if (source == null) {
            throw new IllegalArgumentException("Source list must not be null");
        }
        // 创建并返回新的 List
        return new ArrayList<>(source);
    }

    /**
     * 将源 List 的内容复制到目标 List。
     *
     * @param source 源 List
     * @param target 目标 List
     * @param <T>    List 中的元素类型
     */
    public static <T> void copyList(List<T> source, List<T> target) {
        if (source == null || target == null) {
            throw new IllegalArgumentException("Source and target lists must not be null");
        }
        target.clear(); // 清空目标 List
        target.addAll(source); // 复制源 List 的内容
    }
}
