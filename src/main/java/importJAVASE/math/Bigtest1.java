package importJAVASE.math;

import java.math.BigDecimal;

public class Bigtest1 {
    public static void main(String args[]) {
        BigDecimal bigDecimal1 = new BigDecimal(0);
        BigDecimal bigDecimal2 = new BigDecimal("0.00");

        System.out.println("equals?    " + bigDecimal1.equals(bigDecimal2));
    }
}
