package importJAVASE.annotation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 * @author cln
 * @version $Id: Base.java v 0.1 18-11-5 下午1:42 cln Exp $$
 */
@Getter
@Setter
public class Base {

    @Content(name = "名字")
    private String name;

    @Content(name = "日期")
    private Date date;

    @Content(name = "类型", ennumType = StateEnum.class, fieldType = FieldTypeEnum.ENUM)
    private Integer integer;
}
