package jsonfast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by evel on 2017/7/21.
 */
public class MyJson {

    public JSONObject convertJson(Map<String, String> map) {
        return (JSONObject) JSON.toJSON(map);
    }

}
