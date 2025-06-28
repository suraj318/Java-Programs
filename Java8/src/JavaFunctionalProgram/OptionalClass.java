package JavaFunctionalProgram;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        
        String str= "Suraj";
        Optional<String> name= Optional.ofNullable(str);
        
        System.out.println(name.orElse("Default Value"));

        Optional<String> upper= name.map(String::toUpperCase);
        System.out.println(upper.orElse("Default"));

        String orElseGet = name.orElseGet(()->{
            System.out.println("This is orElseGet");
            return "Default";
        });
        System.out.println(orElseGet);

    }
}
