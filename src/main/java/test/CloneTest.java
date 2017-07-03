package test;

/**
 * Created by Administrator on 2017/7/3 0003.
 *
 * 编写了Cat类，该类中重写了Clone方法
 *
 */
public class CloneTest {

    public static void main(String args[]) throws CloneNotSupportedException {
        Cat cat1 = new Cat("Cat1",12);

        Cat cat2 = (Cat)cat1.clone();
        cat2.setName("Cat2");
        System.out.println(cat2.toString());
        System.out.println(cat1.toString());

    }
}
