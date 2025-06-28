package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP08 {
	public static void main(String[] args) {
		System.out.println("-----------BehaviorParameterization--------------\n");
		
		List<Integer> nums = Arrays.asList( 1,12, 4,4, 5, 6, 8,1,  45);
		
		FilterPredicate(nums, x->x%2==0);
		
		System.out.println();
		
		FilterPredicate(nums, x->x%2==1);
		
		System.out.println();
		FilterPredicate(nums, x->x%3==0);
		
		
		
		
		List<Integer> squareNums=extracted(nums, x->x*x);
		List<Integer> doubleNums=extracted(nums, x->x+x);
		System.out.println(squareNums);
		System.out.println(doubleNums);
		
	}

	private static List<Integer> extracted(List<Integer> nums, Function<Integer, Integer> mappingFunc) {
		return nums.stream()
				.map(mappingFunc)
				.collect(Collectors.toList());
	}

	private static void FilterPredicate(List<Integer> nums, Predicate<? super Integer> FilterPredicate) {
		nums.stream()
		.distinct()
		.filter(FilterPredicate)
		.forEach(System.out::println);
	}

}
