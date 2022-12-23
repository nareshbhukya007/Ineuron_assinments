package com.java.demo8;

public class LamdaExpression  {

	/*
	 * @Override public void m1() { System.out.println("implementation of m1"); }
	 */

	public static void main(String[] args) {
		//emo d = new LamdaExpression();
		Demo d = () -> System.out.println("implementation of lamdaExpression");
		d.m1();

	}
}
