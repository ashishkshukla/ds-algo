package algo.generic;

public class DigitDivisorHackerRank {
	public static void main(String[] args) {
		System.out.println(findDigits(102331));
	}

	static int findDigits(int n) {
		int originalVal = n;
		int count = 0;
		while (n != 0) {
			int reminder = n % 10;
			if (reminder != 0 && originalVal % reminder == 0)
				count += 1;
			n = n / 10;
		}
		return count;
	}
}
