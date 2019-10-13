package com.ssw.int1;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author saurabh
 *
 * This questions asked on StackOverflow
 * https://stackoverflow.com/questions/58335354/understanding-sorting-behaviour-of-character-in-hashset
 */
public class HashSetNoGuarateeOfInsertionOrder {

	public static void main(String[] args) {
		String str = "zbaAacb";
		// Set<Character> uniqCharSet = uniqueCharSet();
		System.out.println("Unique Characters are : " + uniqueCharSet(str));

	}
	
	public static Set<Character> uniqueCharSet(String str) {
		Set<Character> charSet = new HashSet<Character>();

		// to maintain insertion order, we can use LinkedHashSet
		// Set<Character> charSet = new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			charSet.add(str.charAt(i));
		}
		for(Character c : charSet) {
			System.out.println("Hashcode of " + c + " is : " +c.hashCode());
		}
		return charSet;
	}

}
