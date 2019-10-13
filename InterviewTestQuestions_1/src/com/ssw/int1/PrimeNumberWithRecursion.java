package com.ssw.int1;

public class PrimeNumberWithRecursion {

	public static void main(String[] args) {
		int num =2;
		PrimeNumberWithRecursion pn = new PrimeNumberWithRecursion();
		System.out.println(num +" Is Number Prime : " + pn.isPrime(num));
	}

	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
		} else if(num == 2) {
			return true;
		} else {
			// modulo divide number by 2 to (num/2)
			int divisor = 2;
			return isPrimeRecursion (num, divisor);
		}
	}
	
	public boolean isPrimeRecursion(int num, int divisor) {
		if ( (num % divisor) == 0) {
			// number is not prime
			return false;
		}
		if(num/2 >= divisor) {
			divisor++;
			return isPrimeRecursion(num, divisor);
		} else {
			return true;
		}
	}
	
	
}
