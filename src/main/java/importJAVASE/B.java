package importJAVASE; /**
 * Created by Administrator on 2017/3/7 0007.
 */

import java.lang.reflect.Field;

class B {
    public static void main(String args[]) {
        A r = new A();
        Class temp = r.getClass();
        try {
            System.out.println("反射类中所有公有的属性");
            Field[] fb = temp.getFields();
            System.out.println(fb.length);
            for (int j = 0; j < fb.length; j++) {
                Class cl = fb[j].getType();
                System.out.println("fb:" + cl);
            }

            System.out.println("反射类中所有的属性");
            Field[] fa = temp.getDeclaredFields();
            for (int j = 0; j < fa.length; j++) {
                Class cl = fa[j].getType();
                System.out.println("fa:" + cl);
            }
            System.out.println("反射类中私有属性的值");
            Field f = temp.getDeclaredField("a");
            f.setAccessible(true);
            Integer i = (Integer) f.get(r);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}