package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FP04 {
	
	public static void main(String[] args) {
		System.out.println("FP04");
		List<Integer> nums = Arrays.asList( 1, 4, 5, 6, 8,56, 34, 23, 12, 45);
		
		//Square Every Number in List and Find Sum of Cube
		System.out.println("SumOfCubesofSquare: "+SumOfCubesofSquare(nums));
		System.out.println("SumOfOddNums: "+SumOfOddNums(nums));
	}

	private static int SumOfOddNums(List<Integer> nums) {
		return nums.stream()
		.filter(a->a%2!=0)
		.reduce(0,Integer::sum);
	}

	private static Optional<Integer> SumOfCubesofSquare(List<Integer> nums) {
		return nums.stream()
				.map(a->a*a)
				.reduce(Integer::sum);
		
	}

}
