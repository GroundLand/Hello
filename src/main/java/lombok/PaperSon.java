package lombok;

/**
 *
 * @author cln
 * @version $Id: PaperSon.java v 0.1 18-11-1 下午1:07 cln Exp $$
 */
@ToString(callSuper = true)
public class PaperSon extends PaperParent {

    private String color;

    private double length;

    private double height;
}
