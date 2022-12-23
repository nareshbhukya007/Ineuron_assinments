package com.java.lamdaexpression;

@FunctionalInterface
interface Calc {
	public void add(int a, int b);
}

public class Launch3 {
	public static void main(String[] args) {
		Calc i = (a, b) -> System.out.println("The sum: " + (a + b));
		i.add(10, 50);
	}
}
