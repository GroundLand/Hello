package test;

/**
 * Created by Administrator on 2017/6/30 0030.
 */
public class Base {
    private int age;
    private String name;


    public Base(int age,String name){
        this.age = age;
        this.name = name;
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
}
