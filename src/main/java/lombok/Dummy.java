package lombok;

/**
 *
 * @author cln
 * @version $Id: Dummy.java v 0.1 18-10-31 下午7:20 cln Exp $$
 */
@HelloGetter
public class Dummy {

    private String value;

    private String value2;

    public Dummy(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Dummy dummy = new Dummy("it works");
        //System.out.println(dummy.getValue());
    }
}
