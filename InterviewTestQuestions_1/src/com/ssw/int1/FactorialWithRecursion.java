package com.ssw.int1;
/**
 * 
 * @author saurabh
 *
 * Factorial using recursive function
 */
public class FactorialWithRecursion {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(" Factorial using Recursion of " + num + " is " + factRecur(num));
	}
	
	public static int factRecur(int number) {
		return recursionFunction(number);
	}
	
	public static int recursionFunction(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * recursionFunction(num - 1);
		}
	}

}
