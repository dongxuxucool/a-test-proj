package com.dxx.core.java.test;

public class ReferValueTest {

	private String name = "qwe";
	private Long id= 124414L;
	public void change(String name, Long id){
		name="abc";
		id = 111L;
	}
	public static void main(String[] args) {
		String name="abcd";
		Long id = 1234L;
		ReferValueTest test = new ReferValueTest();
		test.change(name, id);
		System.out.println("name= " + test.name + "&&id = " + test.id);
	}

}
