package com.ssw.int1;
/**
 * 
 * @author saurabh
 *	factorial is : product of all integer less than or equal to that number but greater than one 
 */
public class FactorialSimple {

	public static void main(String[] args) {
		int num = 2;
		System.out.println("** Factorial of " + num + " is : " + findFactorial(num) );
	}
	
	public static int findFactorial(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			// fact = fact * i;
			fact *= i;
		}
		return fact;
	}

}
