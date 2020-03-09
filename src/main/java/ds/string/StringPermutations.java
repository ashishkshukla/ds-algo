package ds.string;

public class StringPermutations {
	public static void main(String[] args) {
		String input = "ABCD";
		printPermutation("", input);
	}

	static void printPermutation(String medString, String input) {
		if (input.isEmpty())
			System.out.println(medString);
		else {
			for (int i = 0; i < input.length(); i++) {
				printPermutation(medString + input.charAt(i), input.substring(0, i) + input.substring(i+1));
			}
		}
	}
}
