package importJAVASE.test;

import com.google.common.base.MoreObjects;

import java.security.PublicKey;

/**
 * Created by Administrator on 2017/6/30 0030.
 */
public class Base {
    private int age;
    private String name;
    private long price;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Base(){}


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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("age",this.age).add("name",this.name).toString();
    }
}
