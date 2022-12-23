package com.java.multithreading;

class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("child Thread");
	}
}
public class Launch1 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.run();
		System.out.println("Thread name: "+mt.getName());
		System.out.println("main Thread");

	}
}
