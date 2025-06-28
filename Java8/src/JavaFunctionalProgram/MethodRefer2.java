package JavaFunctionalProgram;

import java.util.function.Consumer;
import java.util.function.Supplier;

class test1{

    test1(){
        System.out.println("Msg from Constructor Test1");
    }
    void msg(){
        System.out.println("Hello This is msg from Test1");
    }
    public static void msg2(String name){
        System.out.println("Hello "+name);
    }
}

public class MethodRefer2 {

    public static void main(String[] args) {
        
        test1 t= new test1();
        Runnable r= t::msg;
        r.run();

        Consumer<String> str= test1::msg2;
        str.accept("Suraj");

        Supplier<test1> te= test1::new;
        te.get();

    }

}
