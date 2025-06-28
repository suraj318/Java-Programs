package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TryCatch {

	/*
	 * @SuppressWarnings("finally") public static int test() { try { //return 1;
	 * System.out.println("hhhcch"); System.exit(2); System.out.println("hhhh"); }
	 * finally { return 2; } }
	 */
	public static void main(String[] args) {

		
		List<Integer> list=new CopyOnWriteArrayList<>(Arrays.asList(1,2,4,5,7));
		Iterator<Integer> it=list.iterator();
		
		for(Integer n:list) {
			System.out.println(n);
			if(n==4) {
				list.remove(Integer.valueOf(n));
			}
		}
		System.out.println(list);
	}

}
