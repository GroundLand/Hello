package java8.stream;

import java.util.stream.Stream;

public class FeoboArray {
    public static void get() {
        Stream
                .iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);
    }
}
