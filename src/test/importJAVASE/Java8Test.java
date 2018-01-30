package importJAVASE;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by evel on 2017/10/24.
 */
public class Java8Test {
    @Test
    public void sortMap(){
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("a", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);
        Map<String,Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (s1,s2)->s1, LinkedHashMap::new));

        System.out.println("Sorted...");
        System.out.println(result);


    }

    @Test
    public void sortMap1(){
        Stream<String> s = Stream.of("apple", "banana", "apricot", "orange",
                "apple");
        Map<Character, String> m = s.collect(
                Collectors.toMap(s1 -> s1.charAt(0),
                        s1 -> s1,
                        (s1, s2) -> s1 + "|" + s2));
        System.out.println(m);
    }


    //Stream 一行一行读一个文件
    @Test
    public void readFileStream(){
        String file = "d://test.txt";
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(file))){
                list = stream.filter(line->!line.startsWith("line3")).map(String::toUpperCase).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }

}
