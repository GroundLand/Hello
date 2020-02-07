package importJAVASE.math;

import java.math.BigDecimal;

public class Bigtest1 {
    public static void main(String args[]) {
        BigDecimal bigDecimal1 = new BigDecimal(1.5);
        //bigDecimal1.setScale(2);
        BigDecimal bigDecimal2 = new BigDecimal("1.5");

        System.out.println(bigDecimal1.toPlainString());
        System.out.println(bigDecimal2.toString());
    }
}
