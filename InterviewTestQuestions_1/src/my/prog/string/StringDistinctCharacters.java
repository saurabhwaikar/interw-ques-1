package my.prog.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringDistinctCharacters {
	public static void main(String[] args) {
		String str = "zbaaaaabcb";
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
		return charSet;
	}
}
