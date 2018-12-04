package importJAVASE.reflect;

import importJAVASE.test.Base;

import java.lang.reflect.Field;

/**
 * Created by evel on 2017/11/17.
 */
public class ReflectTest {
    public static void main(String[] string) {
        Field[] fields = Base.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(Base.class.getSimpleName());
        }
    }
}
