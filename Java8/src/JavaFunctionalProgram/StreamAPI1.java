package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI1 {
    public static void main(String[] args) {
        
        //Create Stream From List
        List<Integer> list= List.of(1,3,4,23,56,8,42,9,7,6);
        list.stream().forEach(System.out::print);

        System.out.println();
        //Create an Stream from Array
        String[] name= {"Suraj","Ganesh","Mandhane"};
        Arrays.stream(name).forEach(System.out::println);


        //Create an Stream using Stream.of
        Stream.of(name).forEach(System.out::println);

        //Generating an Stream using Stream.generate()
        List<String> list1 = Stream.generate(() -> "Hello").limit(5).collect(Collectors.toList());
        list1.forEach(System.out::println);


        List<String> str= List.of("Suraj", "John", "David", "Steve");

        str.stream()
                    .filter(t -> t.toLowerCase().startsWith("s"))
                    .forEach(System.out::println);

        int sum =list.stream().reduce(0, Integer::sum);
        System.out.println(sum); 


        list.stream().takeWhile(x-> x > 50).sorted().forEach(System.out::println);

        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println(max.get());


    }
}
