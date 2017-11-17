package guava;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by evel on 2017/7/24.
 * @author cl
 * 练习类Joiner类相关重要方法
 * Joiner instances are always immutabl
 */
public class JoinerUtils {

    public String joinToObject(Object[] objects,String delimiter){
        return Joiner.on(delimiter).skipNulls().join(objects);
    }

    public StringBuilder appendToObject(Object[] objects,String delimiter){
        StringBuilder sb = new StringBuilder();
        return Joiner.on(delimiter).skipNulls().appendTo(sb,objects);
    }

    public void mapJoiner(){
        Map<String,String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C","Redskins");
        testMap.put("New York City","Giants");
        testMap.put("Philadelphia","Eagles");
        testMap.put("Dallas","Cowboys");
        //MapJoiner需要通过这种方式创建 Joiner. withKeyValueSeparator(String str);
        Joiner.MapJoiner mapJoiner = Joiner.on("#").
                withKeyValueSeparator("=");
        String returnedString = mapJoiner.join(testMap);
        System.out.println(returnedString);  //Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys
    }

    public static void main(String[] args){
       JoinerUtils joinerUtils = new JoinerUtils();
       String[] strings = {"Wrong",null,"wrong"};
      //  System.out.println(joinerUtils.joinToObject(strings,"||"));
        System.out.println(joinerUtils.appendToObject(strings,"||"));

        Joiner joine = Joiner.on(":").useForNull("missing");
        System.out.println(joine.join(null,null,"Wrong","Wrong"));

        joinerUtils.mapJoiner();
    }
}
