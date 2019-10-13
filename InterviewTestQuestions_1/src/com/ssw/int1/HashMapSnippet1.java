package com.ssw.int1;

import java.util.HashMap;

public class HashMapSnippet1 {

	public static void main(String[] args) {
		/*
		 * Generic parameters can only bind to reference types, not primitive types, 
		 * so you need to use the corresponding wrapper types. 
		 */
		HashMap<Object, Integer> hm = new HashMap<Object, Integer>();
		Object o1 = new Object();
		Object o2 = o1;
		// HashMap.put() method returns previous value associated with specific key
		// or NULL if there was no mapping for the key
		
		hm.put(o1, 1);
		Object o3 = null;
		o3 = hm.put(o2, 2);
		// As o2 is referring to o1, the second put statement actually overwrites 
		// value.
		System.out.println(hm.get(o1) + " : " + hm.get(o2));
		System.out.println(hm.values());
		
		System.out.println(" Previous value : " + o3);
	}

}
