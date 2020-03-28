package importJAVASE.extend;

import java.time.LocalDate;

/**
 * Created by evel on 2017/7/19.
 */
public class Son extends Parent {
    public String s = "Son";

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // 会调用父类的无参构造方法
    public Son() {

    }

    @Override
    public void overrideme() {
        System.out.println("Son  overrideme");
    }
}
