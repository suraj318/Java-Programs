package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterateList {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,5,43,2,89));
		System.out.println(list.size());
		
		//Using For loop
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}
		
		System.out.println();
		
		//Using For-Each Loop
		for(int i: list) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		//Using While Loop
		int i=0;
		while(i<list.size()) {
			System.out.print(list.get(i)+" ");
			i++;
		}
		
	}
}
