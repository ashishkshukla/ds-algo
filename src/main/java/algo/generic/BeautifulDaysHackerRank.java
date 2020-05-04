package algo.generic;

public class BeautifulDaysHackerRank {
	public static void main(String[] args) {
        int startingDay=23;
        int endingDay=30;
        int divisor=4;
        int bfulDays=beautifulDays(startingDay, endingDay, divisor);
        System.out.println(bfulDays);
	}

	static int beautifulDays(int i, int j, int k) {
		int totalDays = 0;
		for (int index = i; index <= j; index++) {
			int revVal = reverse(index);
			if ((revVal - index) % k == 0)
				totalDays += 1;
		}
		return totalDays;
	}

	static int reverse(int num) {
		int reverseNum = 0;

		while (num > 0) {
			int valAtPos = num % 10;
			reverseNum = reverseNum * 10 + valAtPos;
			num = num / 10;
		}
		return reverseNum;
	}
}
