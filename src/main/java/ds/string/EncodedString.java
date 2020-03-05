package ds.string;

import java.util.Stack;

public class EncodedString {

	public static void main(String[] args) {

		String s = "a3[as2[adsks]]9[da]";
		Stack<Integer> lstack = new Stack<Integer>();
		int strlength = s.length();
		int index = 0;
		
		while (index < strlength) {

			if (s.charAt(index) == '[')
				lstack.push(index);
			else if (s.charAt(index) == ']') {
				int counterIndex = lstack.pop() - 1;
				int counter = Integer.parseInt(String.valueOf(s.charAt(counterIndex)));
				String subString = s.substring(counterIndex + 2, index);
				String interMediateString = "";
				for (int i = 0; i < counter; i++)
					interMediateString = interMediateString + subString;
				s = s.substring(0, counterIndex) + interMediateString
						+ s.substring(counterIndex + subString.length() + 3);
				strlength = s.length();
			}
			index++;
		}

		System.out.println(s);

	}

}
