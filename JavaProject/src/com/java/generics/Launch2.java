package com.java.generics;

import java.util.ArrayList;

class Gen<T> {
	T obj;

	public Gen(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("The type of the obj:" + obj.getClass().getName());
	}

	public T getObj() {
		return obj;
	}

}

public class Launch2 {
	public static void main(String[] args) {

		Gen<Integer> g = new Gen<Integer>(10);
		g.show();
		System.out.println(g.getObj());

		Gen<String> g1 = new Gen<String>("nani");
		g1.show();
		System.out.println(g1.getObj());

		Gen<Double> g2 = new Gen<Double>(10.23);
		g2.show();
		System.out.println(g2.getObj());

	}

}
