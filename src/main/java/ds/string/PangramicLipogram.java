package ds.string;

public class PangramicLipogram {
	public static void main(String[] args) {
		String inputString = "The quick brown fox jups over the lazy dog";

		boolean isPangramicLipogram = isPangramicLipogram(inputString);
		System.out.println(isPangramicLipogram);
	}

	public static boolean isPangramicLipogram(String inputString) {
		boolean[] charExists = new boolean[26];
		int countMissingChars=0;
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
				countMissingChars++;
		}
		if(countMissingChars==1)
			return true;
		else
			return false;
	}
}
