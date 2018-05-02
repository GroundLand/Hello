package importJAVASE.singleTest;

import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class test4 {
    public static void main(String[] args){
        try {
            String name  = "骨伤科、骨科专家";

            Class cl = Class.forName(name);
            String modifiler = Modifier.toString(cl.getModifiers());
            Class supercl = cl.getSuperclass();
            System.out.println(modifiler);
            System.out.println(name+"的父类："+supercl.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
