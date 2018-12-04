package importJAVASE;

import java8.stream.Trader;
import java8.stream.Transaction;
import org.joda.time.DateTime;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by evel on 2017/10/24.
 */
public class Java8Test {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void sortMap() {
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
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (s1, s2) -> s1, LinkedHashMap::new));

        System.out.println("Sorted...");
        System.out.println(result);

    }

    @Test
    public void sortMap1() {
        Stream<String> s = Stream.of("apple", "banana", "apricot", "orange",
                "apple");
        Map<Character, String> m = s.collect(
                Collectors.toMap(
                        s1 -> s1.charAt(0),
                        s1 -> s1,
                        (s1, s2) -> s1 + "|" + s2));
        System.out.println(m);
    }

    //Stream 一行一行读一个文件
    @Test
    public void readFileStream() {
        String file = "d://test.txt";
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            list = stream.filter(line -> !line.startsWith("line3")).map(String::toUpperCase).collect(toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }

    //Stream
    @Test
    public void streamTest() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        Optional<Integer> result1 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        result1.get();
    }

    @Test
    public void FeiboTest() {
        DateTime dateTime = new DateTime();
        DateTime lastDate = dateTime.withMonthOfYear(10).withDayOfMonth(22);
        System.out.println(dateTime.dayOfYear().withMaximumValue());
        System.out.println(dateTime.compareTo(lastDate));

    }

    @Test
    public void concuTest() {
        long statTime = System.currentTimeMillis();
        long l = Stream.iterate(1L, i -> i + 1).limit(90).reduce(0L, Long::sum);
        System.out.println(System.currentTimeMillis() - statTime);
    }

}
