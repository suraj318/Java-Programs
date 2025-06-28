package Coding;

import java.util.HashSet;
/*
Given a non-empty array of integers nums, every element appears twice except for one. 
Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

*///https://leetcode.com/problems/single-number/

public class singleNumber {

	public static void ReturnSingle(int[] nums) {
		
		HashSet<Integer> unique= new HashSet<>();
		for(int n:nums) {
			if(!unique.add(n)) {
				unique.remove(n);
			}
		}
		System.out.println(unique.iterator().next());
	}
	public static void main(String[] args) {
		
		ReturnSingle(new int[] {1,2,4,4,1});

	}
}
