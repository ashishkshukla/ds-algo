package ds.string;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {
	public static void main(String[] args) {
		String s = "a";
		System.out.println(isValid(s));
	}

	public static String isValid(String s) {
		Map<Character, Integer> stringCountMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char indexChar = s.charAt(i);
			if (stringCountMap.containsKey(indexChar))
				stringCountMap.put(indexChar, stringCountMap.get(indexChar) + 1);
			else
				stringCountMap.put(indexChar, 1);
		}
		System.out.println(stringCountMap);
		int tempCharCount = 0;
		boolean alreadyRemoved = false;
		String isValid = "YES";
		int i = 0;
		for (Map.Entry<Character, Integer> entry : stringCountMap.entrySet()) {
			if (tempCharCount == 0) {
				if (entry.getValue() - 1 == 0) {
					alreadyRemoved = true;
				} else {
					i++;
					tempCharCount = entry.getValue();
				}
			} else if (entry.getValue() == tempCharCount) {
				i++;
				continue;
			} else if (entry.getValue() == tempCharCount - 1 && alreadyRemoved != true) {
				if (i < 2) {
					tempCharCount = entry.getValue();
				}
				alreadyRemoved = true;

			} else if (entry.getValue() - 1 == tempCharCount && alreadyRemoved != true) {
				alreadyRemoved = true;
			} else if ((entry.getValue() - 1) == 0 && alreadyRemoved != true) {
				alreadyRemoved = true;
			} else {
				isValid = "NO";
				break;
			}
		}

		return isValid;
	}
}
