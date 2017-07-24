package jsonfast;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by evel on 2017/7/21.
 */
public class MainTest {
    public static void main(String args[]){
       MyJson my = new MyJson();

       Map<String,String> map = Maps.newHashMap();
       map.put("name","Alice");
       map.put("remark","nice");

       JSONObject jo = my.convertJson(map);
       System.out.println(jo.toJSONString());
    }
}
