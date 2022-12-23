package com.java.lamdaexpression;

@FunctionalInterface
interface Demo {
	public int getLength(String s);
}

public class Launch2 {
	public static void main(String[] args) {
		Demo i = (s) -> s.length();
		System.out.println("lenth of the string:" + i.getLength("naresh"));
	}
}
