package com.ssw.int1;

/**
 * 
 * @author saurabh
 *
 *	An object is immutable if its state cannot change after construction. Immutable objects 
 *	don’t expose any way for other objects to modify their state; the object’s fields 
 *	are initialized only once inside the constructor and never change again.
 *	Theory explained after the program
 */
public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
 *	1) Make your class final, so that no other classes can extend it. 
 *	2) Make all your fields final, so that they’re initialized only once inside the 
 *		constructor and never modified afterward. 
 *	3) Don’t expose setter methods. 
 *	4) When exposing methods which modify the state of the class, you must always return a 
 *		new instance of the class.
 * 
 * 
 */

