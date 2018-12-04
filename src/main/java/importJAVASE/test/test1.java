package importJAVASE.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/6/9 0009.
 */
public class test1 {
    public static void main(String[] args) {

        String str = "a";
        System.out.print(testReturn(str));
        StringBuilder stringBuilder = new StringBuilder(10_001);
        List<Integer> list = Stream.iterate(1, i -> i + 1).limit(10_000).collect(Collectors.toList());
        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        System.out.println(System.nanoTime() - startTime);

    }

    public static int testReturn(String str) {
        switch (str) {
            case "a":
                return 1;
            case "b":
                return 2;
            default:
                return 3;
        }
    }
}
