package com.java.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Anil");
		String s2 = new String("Anil");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		s1.concat("nani");
		System.out.println(s1);
		
		
		System.out.println("-------");
		
		StringBuilder sb = new StringBuilder("nani ");
		StringBuilder sb1 = new StringBuilder("nani ");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		sb.append("Nani"); //on the same object so mutable string
		System.out.println(sb);
	}

}
