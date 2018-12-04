package importJAVASE;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by evel on 2017/7/24.
 */
public class MapTest {

    @Test
    public void mapIterator() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Alice");
        map.put("sex", "女");

        //迭代
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("key: " + entry.getKey() + "  value:" + entry.getValue());
        }

        //        for(Map.Entry<String,String> entry:map.entrySet())
        //            System.out.println("key: "+entry.getKey()+"   value:"+entry.getValue());

    }

    @Test
    public void map() {
        String startString = "Washington D.C=Redskins#New YorkCity=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C", "Redskins");
        testMap.put("New York City", "Giants");
        testMap.put("Philadelphia", "Eagles");
        testMap.put("Dallas", "Cowboys");
        Splitter.MapSplitter mapSplitter =
                Splitter.on("#").withKeyValueSeparator("=");
        Map<String, String> splitMap =
                mapSplitter.split(startString);
    }
}
