package importJAVASE;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConllectionTest {
    @Test
    public void genericTest(){
        List<Integer> list=new ArrayList<>();
        Integer i  =new Integer(2);
        Integer j = new Integer(2);

        String str1= new String("234");
        String str2="234";
        System.out.println(i==j);
        System.out.println(str1 == str2);
        System.out.println("-----starting debug.....");
        list.add(2);
    }
}
