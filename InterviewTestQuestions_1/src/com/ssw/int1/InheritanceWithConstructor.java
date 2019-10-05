package com.ssw.int1;

/**
 * 
 * @author saurabh
 * 
 * Here All classes have parameterless constructor
 *
 */
public class InheritanceWithConstructor {

	public static void main(String[] args) {
		inhConstC c = new inhConstC();
	}

}

class inhConstA {
	public inhConstA () {
		System.out.println("!!! inhConstA : Constructor");
	}
}

class inhConstB extends inhConstA{
	public inhConstB () {
		System.out.println("!!! inhConstB : Constructor");
	}
}

class inhConstC extends inhConstB{
	public inhConstC () {
		System.out.println("!!! inhConstC : Constructor");
	}
}


/*
 * In inheritance relationship, when we create an object of a child class, 
 * then first base class constructor and then derived class constructor 
 * get called implicitly.
 */

