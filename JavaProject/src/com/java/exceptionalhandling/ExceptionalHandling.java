package com.java.exceptionalhandling;

import java.util.Scanner;

public class ExceptionalHandling {

	public static void main(String[] args) {
		int num1, num2, res;
		try {
			System.out.println("connection to calc app is Established");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the first number to divide");
			num1 = sc.nextInt();
			System.out.println("enter the second number to divide");
			num2 = sc.nextInt();
			res = num1 % num2;
			System.out.println("The result is " + res);
		} catch (Exception e) {
			System.out.println("You are trying to divide by zero illogical");
		}System.out.println("connection is terminated");
	}

}
