package importJAVASE.test;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class StringTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("123");
        StringTest st = new StringTest();
        String s = "=========";
        st.change(sb, s);
        System.out.println(sb.toString());

        System.out.println(s);
        System.out.println();
        System.out.println();

        Base base = new Base(23, "alice");
        st.changeObj(base);
        int age = base.getAge();
        System.out.println(age);

        int i = 3;
        st.change(i);

    }

    public void change(StringBuilder sb, String s) {
        sb.append("abc");
        s = "---------";
    }

    public void changeObj(Base base) {
        base.setAge(45);
        base.getName();
    }

    public void change(int i) {
        i = 34;
    }
}
