package com.java.array;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] ar = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		int[] arg = { 40, 50, 60,70 };
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };
		String[] str = { "nani", "anil", "lucky", "suresh", "venky" };

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + " ");
		}
		System.out.println();

		for (int i = 0; i< ch.length; i++) {
			System.out.print(ch[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.print("\nlength of the arg Array:" + arg.length);
	}

}
