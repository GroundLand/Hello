package importJAVASE.lang;

public class StringTest {
    public static void main(String[] args) {
        //AtomicInteger
        String str1 = new StringBuilder("chaofan").append("wei").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
