package algo.generic;

public class SavePrisoner {
	public static void main(String[] args) {
		int totalPrioners = 499999999;
		int totalCandies = 999999998;
		int startDistribution = 2;
		System.out.println(saveThePrisoner(totalPrioners, totalCandies, startDistribution));
	}

	static int saveThePrisoner(int n, int m, int s) {
		int lastRoundSweets = m % n;
		if (lastRoundSweets == 0)
			lastRoundSweets = n;

		int warnPrisoner = 0;
		int startPrisoner = s - 1;
		if ((startPrisoner + lastRoundSweets) > n) {
			warnPrisoner = lastRoundSweets - (n - startPrisoner);

		} else {
			warnPrisoner = startPrisoner + lastRoundSweets;
		}
		return warnPrisoner;

	}
}
