package com.java.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[][] a = new int[2][];
		int[] aa= {10,20,30};
		a[0]=new int[3];
		a[0][0]=10;
		System.out.println(a[0][0]);
		System.out.println(aa);
		
		String s ="nani";
		System.out.println("length of the string:"+s.length());
		
		System.out.println("length of the array aa:"+aa.length);
		
		
	}
}
