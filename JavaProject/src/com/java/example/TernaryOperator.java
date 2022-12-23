package com.java.example;

public class TernaryOperator {

	public static void main(String[] args) {

		int a,b,c;
		a=20;
		b=30;
		c=10;
		
		int largestNumber=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(largestNumber);
	}

}
