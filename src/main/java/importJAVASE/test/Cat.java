package importJAVASE.test;

/**
 * Created by Administrator on 2017/7/3 0003.
 */

/**
 * 用于演示对象的克隆
 * 因为Object中的clone方法是protected
 */
public class Cat implements Cloneable {

    private String name;

    private int age;



    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名为："+this.name+"     年龄为："+age;
    }
}
