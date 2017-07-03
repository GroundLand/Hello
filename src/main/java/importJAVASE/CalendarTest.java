package importJAVASE;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by Administrator on 2017/3/23 0023.
 */
public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();  //  2017-03-23
        int month =date.getMonthValue();   //3
        int today = date.getDayOfMonth();  //23

        date = date.minusDays(today-1);   //2017-03-01
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();

        System.out.println("Mon Tue Thu Fri Sat Sun");
        for(int i = 0; i< value; i++)
            System.out.print(" ");
        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.println("*");
            else
                System.out.println(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();

    }
}
