package my.string.prog;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		String str = "zcollection";
		// String str = "amazon";
		System.out.println(" Output " + firstNonRepeatChar(str));
		System.out.println(" Output " + methodTwo(str)); // this will first char of sorted array
	}

	public static char firstNonRepeatChar(String str) {
		char[] charArr = str.toCharArray();
		Map<Character, Integer> mapCharCount = new LinkedHashMap<Character, Integer>();
		for(Character arrItr: charArr) {
			if(mapCharCount.get(arrItr) == null) {
				mapCharCount.put(arrItr, 1);
			} else {
				mapCharCount.put(arrItr, (mapCharCount.get(arrItr) + 1));
			}
		}
		
		for(Map.Entry<Character, Integer> et : mapCharCount.entrySet()) {
			if(et.getValue() == 1) {
				return et.getKey();
			} 
		}
		return '0';
	}
	
	public static char methodTwo(String str) {
		char[] chaArr = str.toCharArray();
		Arrays.sort(chaArr);
		for (int i = 0; i < chaArr.length; i++) {
			for(int j = i+1; j<chaArr.length; j++) {
				if(chaArr[i] != chaArr[j] && chaArr[j] != chaArr[j+1]) {
					return chaArr[j];
				}
			}
		}
		return '0';
	}
}
