package com.ssw.int1;

public class PrePostIncrement1 {
	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodThree();
	}
	
	public static void methodOne() {
		System.out.println("\n Output of MethodOne");
		int i=5;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i++ + ++i);
	}
	
	public static void methodTwo() {
		System.out.println("\n Output of MethodTwo");
		int i=5;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i + i++);
	}
	
	public static void methodThree() {
		System.out.println("\n Output of MethodThree");
		int i=5;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++ + ++i);
	}

}
