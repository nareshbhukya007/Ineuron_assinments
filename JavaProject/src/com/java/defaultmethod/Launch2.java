package com.java.defaultmethod;

interface Left {
	public default void m1() {
		System.out.println("inside left m1 method");
	}
}

interface Right {
	public default void m1() {
		System.out.println("inside Right m1 method");
	}
}

public class Launch2 implements Left, Right {
	public void m1() {
		//	``System.out.println("inside launch2 main m1 method");
		Left.super.m1();
	}

	public static void main(String[] args) {
		Launch2 l2 = new Launch2();
		l2.m1();
		
	}

}
