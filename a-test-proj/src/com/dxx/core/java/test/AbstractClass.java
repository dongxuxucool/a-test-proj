package com.dxx.core.java.test;

public abstract class AbstractClass {

	protected abstract void test();
	
	public void print(String a){
		test();
		System.out.println("a = " + a);
	}
}
