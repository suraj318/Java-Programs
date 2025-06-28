package JavaFunctionalProgram;

import java.util.Arrays;
import java.util.List;

public class FP02 {

	public static void main(String[] args) {

		List<Integer> nums=Arrays.asList(1,3,4,5,6,8,34,23,12,45);
		List<String> str = List.of("Spring","Springboot","API","AWS","Java","Docker","Microservices");

		//Q1 :Print Odd Num
		Oddnum(nums); System.out.println("");
		//Q2 : Even Num
		EvenNum(nums); System.out.println("");
		//Q3 : String Contain Word "Spring"
		ContainSpring(str); System.out.println("");
		//Q4 : Len >=4
		LenMin4(str);System.out.println("");
		//Q5 : Square of Even Num
		SqEven(nums);System.out.println("");
		//Q6 : Cubes of Odd Num
		CubeOdd(nums);
		//Q7 : Number of Character in Each Word
		NumOfChar(str);
		

	}

	private static void NumOfChar(List<String> str) {
		System.out.println("Number of Character in Each Word : ");
		str.stream()
		.map(a->a.length())
		.forEach(System.out::println);
	}

	private static void CubeOdd(List<Integer> nums) {
		System.out.println("Cube of ODD: ");
		nums.stream()
		.filter(a->a%2!=0)
		.map(a->a*a*a)
		.forEach(System.out::println);
	}

	private static void SqEven(List<Integer> nums) {
		System.out.println("Square of EVEN: ");
		nums.stream()
		.filter(a->a%2==0)
		.map(a->a*a)
		.forEach(System.out::println);
	}

	private static void LenMin4(List<String> str) {
		System.out.println("Words with Len >=4: ");
		str.stream()
		.filter(a->a.length()>=4)
		.forEach(System.out::print);
	}

	private static void ContainSpring(List<String> str) {
		str.stream()
		.filter(a->a.contains("Spring"))
		.forEach(System.out::println);
	}

	private static void EvenNum(List<Integer> nums) {
		nums.stream()
		.filter(a->a%2==0)
		.forEach(System.out::print);		
	}

	private static void Oddnum(List<Integer> nums) {
		nums.stream()
		.filter(a->a%2!=0)
		.forEach(System.out::print);
	}

}
