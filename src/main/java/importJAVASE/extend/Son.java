package importJAVASE.extend;

import java.time.LocalDate;

/**
 * Created by evel on 2017/7/19.
 */
public class Son extends Parent{
    public String s ="Son";

    private LocalDate date;

    public Son() {
        super();
    }



    @Override
    public void overrideme() {
        System.out.println("Son  overrideme");
    }
}
