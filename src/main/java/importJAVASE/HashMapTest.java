package importJAVASE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/3/22 0022.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Employee> map = new LinkedHashMap<String, Employee>();

        map.put("1111", new Employee("Dave"));
        map.put("2222", new Employee("Alice"));
        map.put("3333", new Employee("Bob"));
        map.put("4444", new Employee("John"));

        map.remove("1111");

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.println(key);
        }

        //  map.forEach((k,v)-> System.out.println("key:"+k+"  value"+v));

    }
}
