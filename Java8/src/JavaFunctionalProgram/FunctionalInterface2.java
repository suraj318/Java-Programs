package JavaFunctionalProgram;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface2 {

    public static void main(String[] args) {
        
        Predicate<Integer> GrtThan10 = x -> x> 10;
        System.out.println(GrtThan10.test(21));  //true
        System.out.println(GrtThan10.test(8));  //false

        Function<String,Integer> length= s-> s.length();
        System.out.println(length.apply("Suraj"));

        Consumer<String> upper =s-> System.out.println(s.toUpperCase());
        upper.accept("Suraj");

        Supplier<Integer> rand = ()->(int)(Math.random()*100);
        System.out.println(rand.get()); 


    }

}
