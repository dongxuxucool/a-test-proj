package com.dxx.core.java.test;

public class StaticClass extends AbstractClass{

	
	public static void print(){
		System.out.println("asd");
	}
	
	public static void main(String[] args) {
		AbstractClass clazz = new StaticClass();
		clazz.test();
		clazz.print("aaaa");
	}

	@Override
	protected void test() {
		System.out.println("abstract");
	}

	@Override
	public void print(String a) {
		super.print(a);
	}

}
