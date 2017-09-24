package importJAVASE;

import importJAVASE.collection.GenericType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConllectionTest {
    @Test
    public void genericTest(){
        List<String> list=new ArrayList<String>();
        Integer i  =2;
        GenericType.addObj(list,i);
    }
}
