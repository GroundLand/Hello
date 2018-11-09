package lombok;

/**
 *
 * @author cln
 * @version $Id: Paper2.java v 0.1 18-10-31 上午9:47 cln Exp $$
 */
//@RequiredArgsConstructor(staticName = "of")
@NoArgsConstructor(staticName = "of")
public class Paper2 {

    @NonNull
    private String color;

    @NonNull
    private double length;

    private double height;

}
