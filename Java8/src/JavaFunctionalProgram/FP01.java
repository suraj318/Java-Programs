package JavaFunctionalProgram;
import java.util.Arrays;
import java.util.List;

public class FP01 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,5,6,78,8,9);

		//Print All Number With Standard Method
		printAllNum(list);

		//Print All Number With Stream Method
		FPprintAllNum(list);

		//Getting Even Number from List
		EvenNum(list);


	}



	private static void printAllNum(List<Integer> num) {

		System.out.println("This is Using Standard");
		for(int n:num) {
			System.out.print(n);
			System.out.print("-");
		}
	}

	private static void FPprintAllNum(List<Integer> num) {

		System.out.println("\n\nThis is Using Stream");
		num.stream()
		.forEach(System.out::print);
	}

	private static void EvenNum(List<Integer> num) {
		System.out.println("\n\nEven Num: ");
		num.stream()
		.filter(a->a%2==0)
		.forEach(System.out::print);
	}





}
