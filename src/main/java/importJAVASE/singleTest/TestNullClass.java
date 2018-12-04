package importJAVASE.singleTest;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class TestNullClass {
    private static void testMethod() {
        System.out.print("testMethod");
    }

    public static void main(String[] args) {
        ((TestNullClass) null).testMethod();
    }
}
