package my.prog.collection;

import java.util.ArrayList;
/**
 * 
 * @author saurabh
 *
 *	As we all know that Array is a fixed size data structure, i.e.: we cannot change the size of 
 *	an array once it is created. ArrayList uses Array as internal data structure but still can grow. 
 *	Strange?
 *
 *	Answer is after program.
 */
public class ArrayListSnippet1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>(2);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		System.out.println(arrList);
	}

}


/*
 * Whenever the add method is called, it calls the ensureCapacityInternal method and passes 
 * existing size+1 as method argument.
 * 
 * 
 * 
 * 
 * 
 * 
 */
