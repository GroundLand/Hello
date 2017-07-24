package importJAVASE.collection;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by evel on 2017/7/20.
 */
public class ConvertMap {

    public static void main(String args[]){
        String es = "{'name':'rt','age':'56'}";
        convert(es);
    }


    public static void convert(String str){
        Map<String,String> map = JSONObject.parseObject(str, Map.class);
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key = "+entry.getKey()+"    value = "+entry.getValue());
        }

        TestClass tc = JSONObject.parseObject(str,TestClass.class);
        System.out.println(tc.getAge());
    }

}
