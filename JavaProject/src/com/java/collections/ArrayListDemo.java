package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("nani");
		al.add('D');
		al.add(20.34);
		al.addAll(al);
		al.add(0, 100);
		System.out.println(al);
		
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
	}

}
