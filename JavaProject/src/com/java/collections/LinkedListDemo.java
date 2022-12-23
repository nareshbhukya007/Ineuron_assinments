package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList al = new LinkedList();
		al.add(10);// al.add(new Integer(10));
		al.add("nani");
		al.add('D');
		al.addFirst(20);
		al.addLast(30);
		al.add(3, 77);
		System.out.println(al);

		al.addAll(al);
		System.out.println(al);

		// print in forward direction
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\n***********************");

		// print in reverse direction of the array

		ListIterator li = al.listIterator(al.size());
		while (li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}
	}
}
