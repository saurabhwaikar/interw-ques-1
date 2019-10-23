package my.collection.prog;

import java.util.TreeMap;

/**
 * 
 * @author saurabh
 *
 *	TreeMap (which implements SortedMap) stores automatically the keys in the correct order
 */
public class TreeSnippet1 {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> trMap = new TreeMap<Integer, Integer>();
		trMap.put(3,2);
		trMap.put(1,1);
		trMap.put(2,3);
		System.out.println(trMap.values());
	}

}
