package com.java.generics;

class Demo<T extends Number> {

}

public class Launch3 {

	public static void main(String[] args) {

		Demo<Number> d1 = new Demo<Number>();
		Demo<Integer> d2 = new Demo<Integer>();
		//Demo<String> d3 = new Demo<String>();

	}

}
