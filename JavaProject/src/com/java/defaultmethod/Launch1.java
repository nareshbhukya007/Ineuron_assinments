package com.java.defaultmethod;

interface Demo {
	public default void m1() {
		System.out.println("inside default method");
	}
}

public class Launch1 implements Demo {
	public  void m1() {
		System.out.println("inside launch1 method");
	}
	
	public static void main(String[] args) {
		Launch1 l1 = new Launch1();
		l1.m1();
	}

}
