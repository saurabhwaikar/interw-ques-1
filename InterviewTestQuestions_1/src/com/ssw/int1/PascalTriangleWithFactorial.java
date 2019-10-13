package com.ssw.int1;

/**
 * 
 * @author saurabh
 *	
 *	Problem Description:
 *	Pascal’s triangle is an matrix of the binomial coefficients. The number of entries in every row 
 *	increases by 1 starting from the first row having 1 entry and the second row having 2 entries 
 *	and so on. 
 *	Example: 
 *	1 
 *	1 1 
 *	1 2 1 
 *	1 3 3 1
 *
 *	Problem Solution:
 *	For every row of the matrix calculate the binomial coefficients C(row,0) to C(row, row) 
 *	and display them. The binomial coefficient can be calculated using the formula: 
 *	C(n,r) = n!/((n-r)!*r!)
 */
public class PascalTriangleWithFactorial {

	// function to calculate factorial values 
	static int factorial(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++ ) {
			fact*=i;
		}
		return fact;
	}
	
	// function to display pascal triangle values
	static void display(int n) {
		for(int line=0; line<=n; line++) {
			for(int j=0; j<=line; j++) {
				System.out.print(factorial(line) / ( factorial(line-j) * factorial(j) ) + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int noOfRows = 4;
		display(noOfRows-1);
		
	}

}
