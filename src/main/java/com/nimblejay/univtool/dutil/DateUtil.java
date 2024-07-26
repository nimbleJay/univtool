package com.nimblejay.univtool.dutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 *  时间工具类
 *
 */
public class DateUtil {
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    //获取当前日期时间
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    //获取当前日期
    public static LocalDate today() {
        return LocalDate.now();
    }

    /**
     * 获取当前时间
     * @return
     */
    public static LocalTime currentTime() {
        return LocalTime.now();
    }

    /**
     * 将字符串转换为 LocalDate
     *
     * @param dateStr 时间字符串
     * @return localDate
     */
    public static LocalDate stringToLocalDate(String dateStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, formatter);
    }

    /**
     * 将字符串转换为 Date。
     *
     * @param dateStr 要转换的日期字符串
     * @param pattern 日期格式模式
     * @return Date
     * @throws ParseException 如果字符串无法解析为日期
     */
    public static Date stringToDate(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.parse(dateStr);
    }

    /**
     * 将字符串转换为 LocalDateTime
     *
     * @param dateTimeStr 时间字符串
     * @param pattern 时间格式
     * @return LocalDateTime
     */
    public static LocalDateTime stringToLocalDateTime(String dateTimeStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }

    /**
     * 将 LocalDate 转换为字符串
     *
     * @param date 时间字符串
     * @param pattern 时间格式
     * @return String
     */
    public static String localDateToString(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * 将 LocalDateTime 转换为字符串
     *
     * @param dateTime LocalDateTime格式的时间
     * @param pattern 格式
     * @return String
     */
    public static String localDateTimeToString(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    /**
     * 将 Date 转换为字符串。
     *
     * @param date    要转换的 Date 对象
     * @param pattern 日期格式模式
     * @return 转换后的日期字符串
     */
    public static String dateToString(Date date, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }

    /**
     * 获取两个日期之间的天数
     *
     * @param start  开始日期
     * @param end 结束日期
     * @return long
     */
    public static long daysBetweenForDate(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }

    /**
     * 获取两个日期时间之间的小时数
     *
     * @param start  开始日期
     * @param end 结束日期
     * @return long
     */
    public static long hoursBetween(LocalDateTime start, LocalDateTime end) {
        return ChronoUnit.HOURS.between(start, end);
    }

    /**
     * 获取两个日期时间之间的分钟数
     *
     * @param start  开始日期
     * @param end 结束日期
     * @return
     */
    public static long minutesBetween(LocalDateTime start, LocalDateTime end) {
        return ChronoUnit.MINUTES.between(start, end);
    }

    /**
     * 获取当前时间戳
     *
     * @return long
     */
    public static long currentTimestamp() {
        return System.currentTimeMillis();
    }


    /**
     * 将 Date 转换为 LocalDate
     *
     * @param date  日期
     * @return LocalDate
     */
    public static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * 将 Date 转换为 LocalDateTime
     *
     * @param date  日期
     * @return LocalDateTime
     */
    public static LocalDateTime toLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * 将 LocalDate 转换为 Date
     *
     * @param localDate  日期
     * @return Date
     */
    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 将 LocalDateTime 转换为 Date
     *
     * @param localDateTime  日期
     * @return Date
     */
    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取指定日期的开始时间
     *
     * @param date  日期
     * @return LocalDateTime
     */
    public static LocalDateTime startOfDay(LocalDate date) {
        return date.atStartOfDay();
    }

    /**
     * 获取指定日期的结束时间
     *
     * @param date  日期
     * @return LocalDateTime
     */
    public static LocalDateTime endOfDay(LocalDate date) {
        return date.atTime(LocalTime.MAX);
    }

    /**
     * 获取指定日期的下一个星期一
     *
     * @param date  日期
     * @return LocalDateTime
     */
    public static LocalDate nextMonday(LocalDate date) {
        return date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }

    /**
     * 获取指定日期的上一个星期一
     *
     * @param date  日期
     * @return LocalDateTime
     */
    public static LocalDate previousMonday(LocalDate date) {
        return date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
    }
}
