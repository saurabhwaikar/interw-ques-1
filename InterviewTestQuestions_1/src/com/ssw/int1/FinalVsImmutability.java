package com.ssw.int1;

public class FinalVsImmutability {

	public static void main(String[] args) {
		final StringBuilder sb = new StringBuilder("Hello");
		// here new object will be created
		
		sb.append(" world"); // we can perform any change in final variable
		System.out.println(sb);
		
		// but here we can't assign to final variable, it will give compile time error
		// sb = new StringBuilder("Test");
		
		// System.out.println(sb); 
	}

}
