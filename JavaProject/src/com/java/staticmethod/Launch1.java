package com.java.staticmethod;

//Static method inside interface (1.8v)

interface Interf {
	public static void m1() {
		System.out.println("inside static method");
	}
}

public class Launch1 {

	public static void main(String[] args) {
		Launch1 l1 = new Launch1();
		Interf.m1();
		//m1();
		//Launch1.m1();
	}

}
