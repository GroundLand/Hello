package importJAVASE.math;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("十六进制： "+ "0xabcd" +" 转换为10进制： " + Integer.valueOf(0xabcd));

        System.out.println("2的64次方： " + Double.valueOf(Math.pow(2,15)).intValue());

        System.out.println("两个Integer最大值相加 结果为："+(Integer.MAX_VALUE +1));

    }
}
