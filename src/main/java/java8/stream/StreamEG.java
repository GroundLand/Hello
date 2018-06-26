//package java8.stream;
//
//import com.google.common.collect.ImmutableList;
//import com.google.common.collect.Maps;
//import java8.Person;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//import static java.util.stream.Collectors.*;
//
///**
// * Created by evel on 2017/10/23.
// */
//public class StreamEG {
//    public static void main(String[] args){
//    List<Person> persons  = Arrays.asList(
//            new Person("mkyong", 30),
//            new Person("jack", 20),
//            new Person("lawrence", 40)
//    );
//
//    Person person1 = persons.stream().filter((p)->"jack".equals(p.getName())&&20==p.getAge()).findAny().orElse(null);
//    System.out.println("result 1 :" + person1);
//
//    Person person2 = persons.stream().filter(p->{
//        if ("jack".equals(p.getName())){
//            return true;
//        }
//        return false;
//    }).findAny().orElse(null);
//
//    System.out.println(person2);
//
//    List<String> collect  = persons.stream().map(Person::getName).collect(toList());
//    collect.forEach(System.out::println);
//
//
//
//
//
//
//        List<String> items =
//                Arrays.asList("apple", "apple", "banana",
//                        "apple", "orange", "banana", "papaya");
//
//        //个数
//        Map<String,Long> itemMap1 = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        itemMap1.forEach((K,V)->System.out.println(K+"="+V));
//
//        //排序
//        Map<String,Long> itemMap2 = Maps.newLinkedHashMap();
//        itemMap1.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(e -> itemMap2.put(e.getKey(),e.getValue()));
//        System.out.println(itemMap2);
//
//        System.out.println("=============================Collectors  http://www.baeldung.com/java-8-collectors=========================================");
//
//        List<String> result = items.stream()
//                .collect(toList());
//
//        result.forEach(System.out::println);
//
//        String strResult1 = items.stream().collect(joining());
//        String strResult2 = items.stream().collect(joining(" ", "PRE-", "-POST"));
//        Long count = items.stream().collect(counting());
//        Map<Boolean, List<String>> strResult3 = items.stream()
//                .collect(partitioningBy(s -> s.length() <= 5));
//        System.out.println("====join()1====="+strResult1);
//        System.out.println("====join()2====="+strResult2);
//        System.out.println("====counting()====="+count);
//        System.out.println("====partitioningBy()====="+strResult3);
//
//
//    }
//
//}
