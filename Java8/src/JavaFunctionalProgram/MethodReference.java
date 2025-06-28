package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        
        List<String> name= Arrays.asList("aaa","mmm","qqq","ppp");

        name.stream()
                    .filter(a-> a.equals("aaa"))
                    .map(x-> x.length())
                    .forEach(System.out::println);
        
        name.sort(String::compareToIgnoreCase);
        System.out.println(name);

        name.stream().map(String::length).forEach(System.out::print);
    }

}
