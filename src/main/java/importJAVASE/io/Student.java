package importJAVASE.io;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public class Student implements Serializable {
    String name;
    int age;
    double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age
                + ", score=" + score + "]";
    }

}
