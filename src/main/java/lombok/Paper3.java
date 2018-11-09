package lombok;

/**
 *
 * @author cln
 * @version $Id: Paper3.java v 0.1 18-10-31 下午6:54 cln Exp $$
 */
@Setter
@Getter
@ToString(exclude = { "color" })
public class Paper3 {

    private String color;

    private double length;

    private double height;
}
