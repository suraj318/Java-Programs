package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FP07 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList( 1,12, 4,4, 5, 6, 8,1,  45);
		
		nums.stream().filter(a->a%2==0).map(a->a*2).forEach(System.out::println);
		
		
		//BinaryOperator<Integer> SumBinaryOper = Integer::sum;
		BinaryOperator<Integer> SumBinaryOper2 = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		int sum= nums.stream().reduce(0, SumBinaryOper2);
		int sum2= nums.stream().reduce(0, Integer::sum);
		System.out.println("Sum : "+sum);
		System.out.println("Sum2: "+sum2);
		
	}

}
