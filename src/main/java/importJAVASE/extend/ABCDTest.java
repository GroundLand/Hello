package importJAVASE.extend;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by ${Administrator} on ${2017/7/3 0003}
 */
public class ABCDTest {

    public Parent getParent() {
        return new Parent();
    }

    public static void main(String args[]) {
        Son son = new Son();
        son.setDate(LocalDate.MAX);
        Parent parent = son;
        System.out.println(parent);
    }

}
