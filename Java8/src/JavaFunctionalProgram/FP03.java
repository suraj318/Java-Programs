package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;

public class FP03 {
	public static void main(String[] args) {
		System.out.println("FO03");

		List<Integer> nums = Arrays.asList( 3, 4, 5, 6, 8,56, 34, 23, 12, 45);
		List<Integer> nums1 = Arrays.asList(2,3,4,5,6,7,8,9,12);
		/*
		 * int sum=0; for(int a: nums) { sum+=a;} System.out.println(sum);
		 */
		System.out.println("Sum of Nums: "+AddNum(nums));
		System.out.println("Sum of Nums: "+AddNum1(nums1));
		System.out.println("Max Num :"+MaxNum(nums));
		System.out.println("Min Num :"+MinNum(nums));


	}

	private static int MinNum(List<Integer> nums) {
		return nums.stream().reduce(Integer.MAX_VALUE, (a,b)->a>b?b:a);
	}

	private static int MaxNum(List<Integer> nums) {
		return nums.stream().reduce(Integer.MIN_VALUE, (a,b)-> a>b?a:b);
	}

	private static int AddNum1(List<Integer> nums1) {
		return nums1.stream().reduce(0, (a,b)->a+b);
	}

	private static int AddNum(List<Integer> nums) {
		//return nums.stream().reduce(0, (a, b) -> a + b);
		return nums.stream().reduce(0, Integer::sum);
	}
	
	

}
