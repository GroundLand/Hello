package importJAVASE.collection;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by evel on 2017/7/24.
 */
public class TestMain {
    public static void main(String[] args) {
        List<Integer> integers = Lists.newArrayList();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        String string = integers.toString().replace(", ", ";\n")
                .replaceFirst("\\[", "");
        System.out.println(integers);
        System.out.println(string);

        List<Integer> integers1 = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        for (int i = 0; i <= integers1.size() / 10; i++) {
            System.out.println("integers1  " + integers1.subList(0, 10));
            List<Integer> subIntegerList = integers1.subList(0, 10);
            subIntegerList.clear();
            System.out.println(integers1.size());
        }

        //        System.out.print(integers.subList(0,3));
        //        integers.removeAll(integers.subList(0,3));
        //        System.out.print(integers);
    }
}
