package importJAVASE.extend;

import java.time.LocalDate;

/**
 * Created by evel on 2017/7/19.
 */
public class Son extends Parent{
    private LocalDate date;

    public Son(){
        date = LocalDate.of(2017,8,15);
    }

    @Override
    public void overrideme() {
        System.out.println(date);
    }
}
