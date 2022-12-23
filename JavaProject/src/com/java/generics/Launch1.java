package com.java.generics;

import java.util.ArrayList;

public class Launch1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("nani");
		al.add("anil");
		//al.add(3);
		al.add(new Integer(10));
		String name = (String)al.get(2);
		System.out.println(al.get(2));
		
	}

}
