package com.ssw.int1;

public class InstanceInitializerBlock {

	public static void main(String[] args) {
		InstInitC iic = new InstInitC();
	}
}

class InstInitA {
	// this is instance initializer block
	{
		System.out.println("Instance A");
	}
}

class InstInitB extends InstInitA {
	// this is instance initializer block
	{
		System.out.println("Instance B");
	}
}

class InstInitC extends InstInitB {
	// this is instance initializer block
	{
		System.out.println("Instance C");
	}
}