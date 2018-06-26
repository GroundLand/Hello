package importJAVASE.time;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Locale;

public class test {
    public static void main(String[] args){

        String date = "07-31-2017 7:32:06 PM";
        //withLocale(Locale.ENGLISH)是新增代码
        DateTimeFormatter builder = DateTimeFormat.forPattern("MM-dd-yyyy h:mm:ss a").withLocale(Locale.ENGLISH);
        System.out.println(builder.parseDateTime(date));
    }
}
