package importJAVASE.lang;

/**
 *
 * @author cln
 * @version $Id: ClassTest.java v 0.1 18-9-25 上午11:16 cln Exp $$
 */
public class ClassTest {
    public static void main(String args[]) {
        System.out.println("获取包类信息    " + Son.class.getName());
        System.out.println("映射this是不是制定对象的子类，如果是返回，    " + Son.class.asSubclass(Parent.class));
    }
}
