package importJAVASE.annotation;

import importJAVASE.time.DateFormatUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/**
 *
 * @author cln
 * @version $Id: ATest.java v 0.1 18-11-5 下午2:09 cln Exp $$
 */
public class ATest {

    private final static String ENUM_METHOD_NAME = "getDescByType";

    public static void main(String[] args) throws Exception {
        String str = "";
        Base base = new Base();
        base.setName("cl");
        base.setDate(new Date());
        base.setInteger(0);

        //step1 获取所有属性
        Field[] fields = Base.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(base);
            if (value != null) {

                //step2 获取属性的注解
                Content content = field.getAnnotation(Content.class);
                if (content != null) {
                    str = "更新了" + content.name();

                    //step3 对属性值进行格式转换
                    if (value instanceof String) {
                        str += value;
                    } else if (value instanceof Date) {
                        str += DateFormatUtil.formatOnlyDateTime((Date) value);
                    } else if (value instanceof Integer && content.value().isEnum()) {
                        Method method = content.value().getMethod(ENUM_METHOD_NAME, Integer.class);
                        str += method.invoke(null, (Integer) value);
                    }
                }
            }
        }

        System.out.println(str);

    }
}
