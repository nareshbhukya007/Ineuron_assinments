package com.java.lamdaexpression;

interface Interaf {
	public void m1();

	default void m2() {
		System.out.println("inside m2 method");
	}
}

/*
 * class Demo implements Interaf {
 * 
 * @Override public void m1() { System.out.println("inside m1 method"); }
 * 
 * }
 */

public class Launch1 {

	public static void main(String[] args) {
		/*
		 * Interaf i = new Demo(); i.m1();
		 */
		Interaf i = () -> {
			System.out.println("m1() method implementation");
			System.out.println("lamda expression");
		};
		i.m1();
		i.m2();

	}

}
