package jodatime;

import com.google.common.base.CharMatcher;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by evel on 2017/7/21.
 */
public class MainTest {

    public static Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args) {

        String startDate = CharMatcher.is('-').removeFrom("201601");
        startDate = startDate.substring(0, 6);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        try {
            dateFormat.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTime dateTime = new DateTime(new Date());

        System.out.println(dateTime);

        System.out.println(
                dateTime.dayOfWeek().withMinimumValue().toString("yyyy-MM-dd")
        );

        for (int i = 0; i < 0; i++) {

        }

    }

    private static void ss(final int i) {
        System.out.println(i);
    }
}
