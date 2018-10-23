package lombok;

/**
 *
 * @author cln
 * @version $Id: LTest.java v 0.1 18-10-23 上午10:40 cln Exp $$
 */
public class LTest {

    public static void main(String args[]) {
        //可以用val
        val paper = new Paper("yellow");   //使用构造函数

        System.out.println("颜色为: " + paper.getColor());

        //使用setter方法
        paper.setColor("blue");

        System.out.println("使用其toString方法： " + paper);
    }
}
