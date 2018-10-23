package lombok;

import com.sun.istack.internal.NotNull;

/**
 *
 * @author cln
 * @version $Id: Paper.java v 0.1 18-10-23 上午10:38 cln Exp $$
 */
@Data
public class Paper {
    @NonNull
    private String color;

    private double length;

    private double height;

}
