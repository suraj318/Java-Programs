package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP09 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList( 1,12, 4,4, 5, 6, 8,1,  45);
		
		Predicate<Integer> isEvenPredicate = x-> x%2==0;
		System.out.println("isEvenPredicate : "+isEvenPredicate.test(2));
		
		Function<Integer, Integer> squareFunction = x-> x*x;
		System.out.println("\nsquareFunction : "+squareFunction.apply(4));
		
		Consumer<Integer> sysoutCondumer = x -> System.out.println("\nsysoutCondumer : "+x);
		sysoutCondumer.accept(12);
		
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		System.out.println("\nsumBinaryOperator : "+sumBinaryOperator.apply(3, 8));
		
		// No Input Return Something
		Supplier<Integer> randomIntegerSupplier1 = () -> 2; 
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random rand = new Random();
			return rand.nextInt(1000);
		};
		System.out.println("\nrandomIntegerSupplier1 : "+randomIntegerSupplier1.get());
		System.out.println("randomIntegerSupplier : "+randomIntegerSupplier.get());
		
		
		//Unary Operator get One Parameter and Return Value of Same Type
		UnaryOperator<Integer> unaryOperator = (x) -> 5*x;
		System.out.println("\nunaryOperator : "+unaryOperator.apply(10));
		
		
		BiPredicate<Integer, Integer> biPredicate = (x,y)->x>y;
		System.out.println("\nbiPredicate : "+biPredicate.test(10, 12));
		
		BiFunction<Integer, Integer, Integer> biFunction = (x,y)-> x*y;
		System.out.println("\nbiFunction : "+biFunction.apply(10, 7));
		
		
		BiConsumer<Integer, String> biConsumer = (x,y) -> System.out.println(y);
		BiConsumer<Integer, String> biConsumer2 = (x,y) -> System.out.println(x);
		biConsumer.accept(12,"aaa");
		biConsumer2.accept(18, "abc");
		
		
		
		
	}


}
