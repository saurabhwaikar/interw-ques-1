package com.ssw.int1;

public class StaticBlockInheritance {
	public static void main(String[] args) {
		// Can evaluate next statements one by one : so static block will call.
		
		// case 2 : if both statements are evaluated, though two objects are initialized,
		//			but static blocks will call only once. 
		C cc = new C();
		A ab = new B();
	}
}

class A {
	static {
		System.out.println("A");
	}
}

class B extends A {
	static {
		System.out.println("B");
	}
}

class C extends B {
	static {
		System.out.println("C");
	}
}