package com.java.annotations;

import java.util.ArrayList;

public class TestAnnotation2 {
@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("nani");
		al.add("aravind");

		for (Object obj : al) {
			System.out.println(obj);
		}

	}

}
