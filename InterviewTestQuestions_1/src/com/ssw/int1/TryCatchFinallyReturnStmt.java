package com.ssw.int1;

public class TryCatchFinallyReturnStmt {

	public static void main(String[] args) {
		System.out.println("Try catch finally return \n");
		System.out.println("Output MethodOne : " + methodOne());
		System.out.println("Output MethodTwo : " + methodTwo());
		System.out.println("Output MethodThree : " + methodThree());
		System.out.println("Output MethodFour : " + methodFour());
	}

	// regular execution. No exception.
	private static int methodOne() {
		System.out.println("\n***Method one execution Started.");
		try {
			System.out.println("**********Try block executed");
			return 1;
		} catch (Exception ex) {
			System.out.println("**********Catch block executed");
			return 2;
		} finally {
			System.out.println("**********Finally block executed");
		}
	}

	// Execution with exception.
	private static int methodTwo() {
		System.out.println("\n***Method two execution Started.");
		try {
			System.out.println("**********Try block execution started");
			int a = 10 / 0;
			System.out.println("**********Try block executed finished");
			return 1;
		} catch (Exception ex) {
			System.out.println("**********Catch block executed");
			return 2;
		} finally {
			System.out.println("**********Finally block executed");
		}
	}

	// regular execution. No exception. With return in finally
	private static int methodThree() {
		System.out.println("\n***Method three execution Started.");
		try {
			System.out.println("**********Try block executed");
			return 1;
		} catch (Exception ex) {
			System.out.println("**********Catch block executed");
			return 2;
		} finally {
			System.out.println("**********Finally block executed");
			return 3;
		}
	}

	// Execution with exception and return in finally.
	private static int methodFour() {
		System.out.println("\n***Method Four execution Started.");
		try {
			System.out.println("**********Try block execution started");
			int a = 10 / 0;
			System.out.println("**********Try block executed finished");
			return 1;
		} catch (Exception ex) {
			System.out.println("**********Catch block executed");
			return 2;
		} finally {
			System.out.println("**********Finally block executed");
			return 3;
		}
	}
}
