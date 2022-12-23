package com.java.array;

public class Array {

	public static void main(String[] args) {

		int[] aa = { 0, 13, 20, 30, 0, 20, 408, 58 };

		//Printing of an array
		//normal printing of an array
		System.out.println(aa[1] + "\t" + aa[2] + "\t" + aa[3] + "\t" + aa[5] + "\t" + aa[6] + "\t" + aa[7] + "\t"
				+ aa[0] + "\t" + aa[4]);

		//using for loop
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i] + "  ");
		}
		System.out.println();
		
		//using for each loop
		for (int i : aa) {
			System.out.print(+i+" ");
		}
	}
}
