package importJAVASE.annotation;

import org.joda.time.DateTime;

import java.lang.reflect.Field;
import java.util.Date;

/**
 *
 * @author cln
 * @version $Id: MyProcessor.java v 0.1 18-12-4 下午7:12 cln Exp $$
 */
public class MyProcessor {
    public static void main(String args[]) throws Exception {
        Base base = new Base();
        base.setDate(new Date());
        Field[] fields = Base.class.getDeclaredFields();
        String str = "";
        for (Field field : fields) {
            field.setAccessible(true);
            Content content = field.getAnnotation(Content.class);
            if (content == null) {
                continue;
            }
            if (FieldTypeEnum.STRING.equals(content.fieldType())) {
                str = content.name();
            } else if (FieldTypeEnum.DATE.equals(content.fieldType())) {
                Object obj = field.get(base);
                if (obj instanceof Date) {
                    DateTime dateTime = new DateTime(obj);
                    str = dateTime.toString("yyyy-MM-dd");
                }
            } else if (FieldTypeEnum.ENUM.equals(content.fieldType())
            && content.ennumType() != null){
                Object[] constans = content.ennumType().getEnumConstants();
                for (Object obj:constans){

                }
            }
        }
    }
}
