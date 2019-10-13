package com.ssw.int1;

public class PrimeNumberNearest {

	public static void main(String[] args) {
		int num = 10;
		nearestPrimeNumber(num);
	}

	public static boolean isPrime(int num) {
		boolean isItPrime = true;
		if (num <= 1) {
			isItPrime = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isItPrime = false;
					break;
				}
			}
		}
		return isItPrime;
	}

	public static void nearestPrimeNumber(int num) {
		int diff1 = 0, diff2 = 0;
		int num1 = 0, num2 = 0;
		for (int i = num;; i++)// No end limit as when prime will be found we will break the loop.
		{
			if (isPrime(i)) {
				diff1 = i - num;
				num1 = i;
				break;
			}
		}
		for (int i = num;; i--)// No end limit as when prime will be found we will break the loop.
		{
			if (isPrime(i)) {
				diff2 = num - i;
				num2 = i;
				break;
			}
		}
		if (diff1 < diff2)// Nearest Prime number will have least difference from given number.
			System.out.println("Nearest Prime Number from " + num + " is " + num1);
		else if (diff2 < diff1)
			System.out.println("Nearest Prime Number from " + num + " is " + num2);
		else// There can be more than 1 nearest prime like for 6 we have 5 and 7 as nearest
			// prime.
			System.out.println("Nearest Prime Number from " + num + " is " + num2 + " and " + num1);

	}

}
