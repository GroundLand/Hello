package javase;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by evel on 2017/7/24.
 */
public class MapTest {

    @Test
    public void mapIterator(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","Alice");
        map.put("sex","女");

        //迭代
        Iterator<Map.Entry<String,String>> entries = map.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<String,String> entry = entries.next();
            System.out.println("key: " + entry.getKey() + "  value:" + entry.getValue());
        }

//        for(Map.Entry<String,String> entry:map.entrySet())
//            System.out.println("key: "+entry.getKey()+"   value:"+entry.getValue());

    }
}
