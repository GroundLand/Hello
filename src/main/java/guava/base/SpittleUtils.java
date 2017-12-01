package guava.base;

import com.google.common.base.Splitter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by evel on 2017/7/24.
 */
public class SpittleUtils {

    public static List<String> stringToList(CharSequence sequence,String  delimiter){
        return Splitter.on(delimiter).trimResults().splitToList(sequence);
    }

     public Map<String,String> stringToMap(CharSequence sequence,String delimiter){
        return  Splitter.on(delimiter).withKeyValueSeparator("=").split(sequence);
     }

    public static void main(String[] args){
//        String sequence = "foo,bar,,pool";
        SpittleUtils su = new SpittleUtils();
//        List<String> list = su.stringToList(sequence,",");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        String mapStr = "name=Ailce,age=12,sex=女";
        Map<String,String> map = su.stringToMap(mapStr,",");
        Iterator<Map.Entry<String,String>> entries = map.entrySet().iterator();
//        for(Map.Entry<String,String> entry:map.entrySet())
//            System.out.println("key:"+entry.getKey()+"   value:"+entry.getValue());

        String str = "http://localhost:8003//164/0613ddf142334c7ca704a63b5a9cb765.png,http://localhost:8003//164/182bf71ca2e94a90a1a57ac9084ec953.png";
        List<String> stringList = stringToList(str,"http://localhost:8003/");
        while(entries.hasNext()){
            Map.Entry<String,String> entry = entries.next();
            System.out.println("Key: "+entry.getKey()+"  Value: "+entry.getValue());
        }

        }




}
