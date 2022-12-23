package com.java.lamdaexpression;

@FunctionalInterface
interface SquareIt {
	public int sqr(int x);
}

public class Launch4 {
	public static void main(String[] args) {
		SquareIt i = (a) -> a*a;
		System.out.println(i.sqr(10));
	}
}
