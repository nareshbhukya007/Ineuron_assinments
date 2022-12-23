package com.java.enums;

import com.java.enums.Result1.Seasons;

enum Result1 {
	PASS, FAIL, NR;

	int courseId;

	Result1() {
		System.out.println("inside constructor");
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	enum Seasons {
		SUMMER(10), WINTER(20), SPRING(30),OTHERSEASON(40);

		int value;

		private Seasons(int value) {
			this.value = value;
		}
	}

}

public class Launch2 {
	public static void main(String[] args) {

		for (Seasons ss : Seasons.values()) {
			System.out.println("index:"+ss.ordinal()+" ->name:"+ss.name() +" ->value is: "+ss.value);
		}
		
		Seasons s = Seasons.SUMMER;
		
		switch (s) {
		case SUMMER:
			System.out.println("summer is on");
			break;
		case WINTER:
			System.out.println("winter is on");
			break;
		case SPRING:
			System.out.println("spring is on");
			break;

		default:
			System.out.println("other season is on");
			break;
		}

		/*
		 * Result1.PASS.setCourseId(10); int cid = Result1.PASS.getCourseId();
		 * System.out.println(cid);
		 */

	}
}
