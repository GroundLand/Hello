package importJAVASE.collection;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by evel on 2017/7/24.
 */
public class TestMain {
    public static void main(String[] args){
        Map<String,String> map = Maps.newHashMap();
        System.out.println(map.get("www"));
    }
}
