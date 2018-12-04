package importJAVASE.extend;

/**
 * Created by evel on 2017/7/19.
 */
public class Parent {
    public String s = "Parent";

    public Parent() {
        overrideme();
    }

    public void overrideme() {
        System.out.println("Parent  overrideme");
    }
}
