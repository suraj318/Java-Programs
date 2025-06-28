package JavaFunctionalProgram.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {

		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,5,7,8));

		Iterator<Integer> it= list.iterator();


		System.out.println(list);
		while(it.hasNext()){
			int n= it.next();
			System.out.println(n);
			if(n==8) {
				it.remove();
			}
		}
		System.out.println(list);

	}}
