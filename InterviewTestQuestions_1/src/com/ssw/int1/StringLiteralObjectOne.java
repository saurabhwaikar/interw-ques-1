package com.ssw.int1;


public class StringLiteralObjectOne {

	public static void main(String[] args) {
		methodOne();
		methodTwo();

	}
	
	/*
	 * get output when two strings are created i) first with string literal
	 * ii) second with new string object
	 */
	public static void methodOne() {
		String s1 = "java";
		String s2 = new String("JAVA");
		System.out.println(s2=s1); // question is what will be the output
	}
	
	public static void methodTwo() {
		System.out.println("\nOutput of MethodTwo");
		int a = 2;
		int b = 4;
		int c = 6;
		System.out.println(a = b = c); // question is what will be the output
	}

}
