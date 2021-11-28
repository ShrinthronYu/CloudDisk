package com.wavebigfish.clouddisk.util;

import java.util.Date;

public class DateUtil {
    /**
     * 获取系统当前时间
     *
     * @return 系统当前时间
     */
    public static String getCurrentTime() {
        Date date = new Date();
        return String.format("%tF %<tT", date);
    }
}