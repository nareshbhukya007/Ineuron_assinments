package com.java.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the length of the array:");
		int size = sc.nextInt();
		int[] ar = new int[size];
		/*
		 * ar[0] = 10; ar[1] = 20; ar[2] = 30; ar[3] = 40;
		 */

		for (int i = 0; i < ar.length; i++) {
			System.out.println("please enter the marks of student " + i);
			ar[i] = sc.nextInt();
		}
		System.out.println("The marks of the students are as follows");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
