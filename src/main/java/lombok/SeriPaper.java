package lombok;

import java.io.Serializable;

/**
 *
 * @author cln
 * @version $Id: SeriPaper.java v 0.1 18-10-24 上午11:44 cln Exp $$
 */
@Data
public class SeriPaper implements Serializable {
    private static final long serialVersionUID = 4489097528299529318L;
    private String color;

    private double length;

    private double height;

    private static String string;
}
