package Coding;

import java.util.stream.IntStream;

public class MapToObj1 {
	
	public static void main(String[] args) {
		
		IntStream.range(1, 10).mapToObj(a-> "Item - "+a+" ").forEach(System.out::print);
		System.out.println();
		IntStream.iterate(1, n->n+2).limit(10).forEach(a->System.out.print(a+ " "));
		
	}
}
