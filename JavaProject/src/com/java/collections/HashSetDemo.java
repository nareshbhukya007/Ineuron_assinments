package com.java.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(19);
		hs.add(20);
		hs.add('f');
		hs.add(30);
		hs.add(30);
		hs.add(30);
		System.out.println(hs);
		
	}

}
