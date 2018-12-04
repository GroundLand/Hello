package jodatime;

import org.joda.time.DateTime;
import org.joda.time.Months;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by evel on 2017/7/21.
 */
public class TestDateTime {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //往原来的日期增加
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("增加2天：" + sdf.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println("减2天：" + sdf.format(calendar.getTime()));
        DateTime dateTime = new DateTime();
        System.out.println(dateTime
                .dayOfYear()
                .withMinimumValue()
                .withMillisOfDay(0)
        );
        DateTime dateTime1 = new DateTime(2018, 7, 31, 0, 0);
        dateTime1.minusMonths(1).withDayOfMonth(1);
        calendar.get(2);
        System.out.println("减2天：" + sdf.format(calendar.getTime()));

        DateTime dateTime2 = new DateTime(2015, 9, 2, 0, 0);
        DateTime dateTime3 = new DateTime(2015, 8, 1, 0, 0);
        System.out.println(Months.monthsBetween(dateTime3, dateTime2).getMonths());
    }
}
