package algo.generic;

public class LibraryFineHackerRank {
	public static void main(String[] args) {
		int returnDay = 21;
		int returnMonth = 9;
		int returnYear = 2015;

		int dueDay = 12;
		int dueMonth = 6;
		int dueYear = 2015;

		int totalFine = libraryFine(returnDay, returnMonth, returnYear, dueDay, dueMonth, dueYear);
		System.out.println("fine is " + totalFine);
	}

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int fine = 0;
		if (y1 == y2) {
			if (m1 == m2) {
				if (d1 <= d2) {
					fine = 0;
				} else {
					fine = 15 * (d1 - d2);
				}

			} else if (m1 < m2) {
				fine = 0;
			} else {
				fine = 500 * (m1 - m2);
			}

		} else if (y1 < y2) {
			fine = 0;
		} else {
			fine = 10000;
		}
		return fine;
	}
}
