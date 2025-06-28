package JavaFunctionalProgram;
import java.util.function.Predicate;

public class FunctionalInterface1 {

    public static void main(String[] args) {
        
        Predicate<Integer> isEven= x->x%2==0;
        System.out.println(isEven.getClass());
        System.out.println(isEven.test(3));

        SayName n= name -> {
            String result= "Hello "+name;
            System.out.println(result);
            return result;
        };
        n.name("Suraj");


    }

}

@FunctionalInterface
interface SayName{
    String name(String n);    
}
