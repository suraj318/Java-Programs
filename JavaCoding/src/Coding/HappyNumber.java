package Coding;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/

public class HappyNumber {

	public static boolean happy(int n) {

		Set<Integer> seen= new HashSet<>();

		while(n!=1) {
			if(seen.contains(n)) return false;
			seen.add(n);
			int sum=0;
			
			while(n>0) {
				int digit= n%10;
				sum=sum+digit*digit;
				n=n/10;
			}
			n=sum;
		}


		return true;
	}

	public static void main(String[] args) {
		System.out.println(happy(19));
		System.out.println(happy(11));
	}
}
