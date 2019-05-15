package ds.string;

public class CheckPangram {
	public static void main(String[] args) {
		String inputString = "The quick brown fox jumps over the lazy dog";

		boolean isPangram = isPangram(inputString);
		System.out.println(isPangram);
	}

	public static boolean isPangram(String inputString) {
		boolean[] charExists = new boolean[26];
		int index = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z')
				index = inputString.charAt(i) - 'A';
			else if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z')
				index = inputString.charAt(i) - 'a';
			charExists[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (charExists[i] == false)
				return false;
		}
		return true;

	}
}
