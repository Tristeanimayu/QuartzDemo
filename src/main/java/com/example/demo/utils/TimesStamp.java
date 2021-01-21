package com.example.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: demo
 * @description: 时间戳, 用于区别命名
 * @author: yhj
 * @create: 2021-01-14 14:14
 **/

public class TimesStamp {

    private static final String timesStampPattern = "yyyyMMddHHmmss";
    private static final String timesRealPattern = "yyyy-MM-dd HH:mm:ss";

    public String timesStamp() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();// 格式化时间
        simpleDateFormat.applyPattern(timesStampPattern);// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return simpleDateFormat.format(date);
        }

    public String timesReal() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();// 格式化时间
        simpleDateFormat.applyPattern(timesRealPattern);// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return simpleDateFormat.format(date);
    }
}
