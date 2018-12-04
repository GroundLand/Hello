package importJAVASE.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author cln
 * @version $Id: Content.java v 0.1 18-11-2 下午5:43 cln Exp $$
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Content {

    String name();

    FieldTypeEnum fieldType() default FieldTypeEnum.STRING;

    Class ennumType() default Object.class;

    boolean isAccountId() default false;
}
