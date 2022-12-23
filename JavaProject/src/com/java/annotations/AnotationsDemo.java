package com.java.annotations;

class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	@Override
	void eatSomething() {
		System.out.println("eating foods");
	}
}

public class AnotationsDemo {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eatSomething();

	}

}
