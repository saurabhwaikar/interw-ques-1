package com.ssw.int1;

/**
 * @author saurabh
 *	Always static initializer block will get executed first, as it will execute on class load time.
 *	Static initializer block gets executed only once.
 *
 *	Other two blocks will execute each time new instance gets created
 *	Second- Instance initializer block will get executed.
 *	Third- constructor will get executed
 */
public class ComboStaticConstructInstanceInit {

	public static void main(String[] args) {
		csciiTwo cst = new csciiTwo();
		csciiTwo csta = new csciiTwo();
	}

}

class csciiOne {
	// static initializer block
	static {
		System.out.println("!!! csciiOne ::: static initializer block");
	}
	// instance initializer block	
	{
		System.out.println("!!! csciiOne ::: instance initializer block");
	}
	// constructor
	public csciiOne() {
		System.out.println("!!! csciiOne ::: constructor block");
	}
	
}

class csciiTwo extends csciiOne {
	// static initializer block
	static {
		System.out.println("!!! csciiTwo ::: static initializer block");
	}
	// constructor
	public csciiTwo() {
		System.out.println("!!! csciiTwo ::: constructor block");
	}
	// instance initializer block	
	{
		System.out.println("!!! csciiTwo ::: instance initializer block");
	}
	
}
