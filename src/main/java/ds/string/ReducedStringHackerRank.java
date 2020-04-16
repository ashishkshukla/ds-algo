package ds.string;

import java.io.*;
import java.util.*;

public class ReducedStringHackerRank {

	static String superReducedString(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char valAtIndex = s.charAt(i);
			if (!stack.isEmpty() && stack.peek().equals(valAtIndex)) {
				stack.pop();
			} else {
				stack.push(valAtIndex);
			}
		}
		String resultString = "";
		while (!stack.isEmpty()) {
			resultString = stack.peek().toString() + resultString;
			stack.pop();
		}

		if (resultString.isEmpty())
			resultString = "Empty String";
		return resultString;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\\\path"));

		String s = bufferedReader.readLine();

		String result = superReducedString(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
