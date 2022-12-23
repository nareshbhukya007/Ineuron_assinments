package com.java.enums;

public class Launch1 {

	enum Java {
		JAVA, JEE, SPRINBOOT;

		int courseId;

		Java() {
			System.out.println("constructor is called");
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

	}

	public static void main(String[] args) {
		
		
		Java res = Java.JEE;
		
		System.out.println(res);

		Java res1[] = Java.JAVA.values();

		for(Java aa:res1) {
			System.out.println(aa.ordinal()+" "+aa.name());
		}

	}

}
