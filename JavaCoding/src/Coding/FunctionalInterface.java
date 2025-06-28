package Coding;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface math{
	int op(int a, int b);
}

public class FunctionalInterface {
	public static void main(String[] args) {
		
		//Function
		//Represents a function that takes one argument and returns a result.
		Function<String, Integer> f= a->a.length();
		System.out.println("Function : "+f.apply("Suraj"));
		
		//Predicate
		//Represents a function that takes one argument and returns a boolean (true/false). 
		//Often used for filtering or condition checking.
		Predicate<Integer> p= x -> x > 2;
		System.out.println("Predicate : "+p.test(10));
		
		//Consumer
		//Represents an operation that takes a single input and returns no result (void). 
		//Often used for side effects (like printing or modifying an object).
		Consumer<String> c= x->System.out.println("Consumer : "+x.toUpperCase());
		c.accept("qwertyui");
		
		//Supplier
		//Represents a function that takes no input but returns a result. 
		//Often used for lazy evaluation or providing default values.
		Supplier<Double> s= ()->Math.random();
		System.out.println("Supplier : "+s.get());
		
		
		
		System.out.println("\nCustom Functional Interface : ");
		math sum=(a,b)->a+b;
		math mul=(a,b)->a*b;
		System.out.println(sum.op(10, 20));
		System.out.println(mul.op(10, 20));
		
		
		
	}

}