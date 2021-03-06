package importJAVASE.time;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Locale;

public class test {
    public static void main(String[] args) {

        DateTime dateTime1 =  new DateTime("2019-04-03");
        DateTime dateTime2 =  new DateTime("2019-04-03");
        System.out.println(dateTime1.isBefore(dateTime2));

        String date = "07-31-2017 7:32:06 PM";
        //withLocale(Locale.ENGLISH)是新增代码
        DateTimeFormatter builder = DateTimeFormat.forPattern("MM-dd-yyyy h:mm:ss a").withLocale(Locale.ENGLISH);
        System.out.println(builder.parseDateTime(date));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2)
                    break;
                System.out.println("j=" + j);
            }
            System.out.println("i=====" + i);
        }

    }
}
