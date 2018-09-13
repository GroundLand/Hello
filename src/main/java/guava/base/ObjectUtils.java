package guava.base;

import com.google.common.base.MoreObjects;
import importJAVASE.test.Base;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * Created by evel on 2017/12/18.
 */
public class ObjectUtils {
    public static boolean equals(Object a, Object b) {
        return Objects.equals(a, b);
    }

    /**
     * @Function 简化toString方法
     * @param obj
     * @return
     */
    public static String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(obj);
        for (Field field : fields){
            try {
                field.setAccessible(true);
                helper.add(field.getName(),field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return helper.toString();
    }

    public static void main(String[] args){
        Base base = new Base();
        base.setAge(12);
        base.setName("test");
        base.setPrice(13l);
        System.out.println(toString(base));
    }
}
