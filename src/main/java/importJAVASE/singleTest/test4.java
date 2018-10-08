package importJAVASE.singleTest;

import importJAVASE.lang.Son;

import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class test4 {
    public static void main(String[] args) {

        Class cl = Son.class;
        String modifiler = Modifier.toString(cl.getModifiers());
        Class supercl = cl.getSuperclass();
        System.out.println(modifiler);
        System.out.println("父类：" + supercl.getName());
        System.out.println("包名" + cl.getPackage().getName());

    }
}
