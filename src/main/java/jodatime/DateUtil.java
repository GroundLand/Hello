package jodatime;

import org.joda.time.DateTime;

import java.util.Date;

/**
 *
 * @author cln
 * @version $Id: DateUtil.java v 0.1 18-11-21 下午4:04 cln Exp $$
 */
public class DateUtil {
    /**
     *  日期所属一月的第一天
     * @param date 日期
     * @return 日期
     */
    public static Date getFirstDayOfMonth(Date date) {
        DateTime dateTime = new DateTime(date);
        return dateTime
                .dayOfMonth()
                .withMinimumValue()
                .withMillisOfDay(0)
                .toDate();
    }

    /**
     * 日期所属一年的第一天
     * @param date 日期
     * @return 日期
     */
    public static Date getFirstDayOfYear(Date date) {
        DateTime dateTime = new DateTime(date);
        return dateTime
                .dayOfYear()
                .withMinimumValue()
                .withMillisOfDay(0)
                .toDate();
    }

    /**
     * 增加年数 -1天
     * @param date 日期
     * @param year 年
     * @return 日期
     */
    public static Date getAfterYearDate(Date date, int year) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusYears(year).plusDays(-1).toDate();
    }

    /**
     * 减少年日期
     *
     * @param date 日期
     * @param year 年
     * @return 日期
     */
    public static Date minusYearDate(Date date, int year) {
        DateTime dateTime = new DateTime(date);
        return dateTime.minusYears(year).toDate();
    }

    /**
     * 增加年日期
     *
     * @param date 日期
     * @param year 年
     * @return 日期
     */
    public static Date plusYearDate(Date date, int year) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusYears(year).toDate();
    }
}
