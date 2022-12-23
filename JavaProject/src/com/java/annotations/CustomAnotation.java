package com.java.annotations;

import java.io.ObjectInputStream.GetField;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
	// int num();

	// String names();

	int num() default 0;

	String name() default "naresh";
}

@MyAnnotation(name = "naresh", num = 101)
class Mens {
	private String color;
	private int weight;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

public class CustomAnotation {
	public static void main(String[] args) {
		Mens m = new Mens();
		m.setColor("white");
		m.setWeight(70);
		System.out.println("color:" + m.getColor() + " weight:" + m.getWeight() + "kgs");
		Class cl = m.getClass();
		Annotation an = cl.getAnnotation(MyAnnotation.class);
		MyAnnotation ma = (MyAnnotation) an;
		System.out.println(ma.name());
		System.out.println(ma.num());
		System.out.println("color:" + m.getColor() + " weight:" + m.getWeight() + "kgs");

	}

}
