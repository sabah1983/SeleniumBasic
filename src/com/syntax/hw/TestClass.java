package com.syntax.hw;

import com.syntax.utils.BaseClass;

public class TestClass extends BaseClass{
	
	public static void main(String[] args) {
		
		setUp();
		String title=driver.getTitle();
		
		System.out.println(title);
		
		tearDown();
	}
	
//	public static void select(int i) {
//		
//	}
//	
//	public static void select(String i) {
//		
//	}
	
	

}
