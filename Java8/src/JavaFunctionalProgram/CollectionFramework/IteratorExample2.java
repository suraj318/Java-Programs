package JavaFunctionalProgram.CollectionFramework;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample2 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<>(Arrays.asList(1,4,6,7,8,7,5,4));
		
		ListIterator<Integer> it= list.listIterator();
		
		while(it.hasNext()) {
			int n= it.next();
			System.out.println(n);
			
		}
		System.out.println(list);
		
	}
}
