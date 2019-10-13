package com.ssw.int1;

public class PrimeNumberSimple {

	public static void main(String[] args) {
		int num = 11;
		System.out.println(num + " Is Prime " + isPrime(num));
	}
	
	public static boolean isPrime(int num) {
		boolean isItPrime = true;
		if(num <= 1) {
			isItPrime = false;
		} else {
			for(int i=2; i<=num/2; i++) {
				if(num%i == 0) {
					isItPrime = false;
					break;
				}
			}
		}
		return isItPrime;
	}

}
