package importJAVASE.extend;

/**
 * Created by ${Administrator} on ${2017/7/3 0003}
 */
public class ABCDTest {

    public Parent getParent(){
        return new Parent();
    }


    public static void main(String args[]){

        String s5 = new String("11");
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s5.intern()));
        String s6 = "11";

        System.out.println(System.identityHashCode(s6));
        System.out.println(s5 == s6);

    }

}
