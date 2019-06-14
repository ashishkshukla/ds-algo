package ds.array;

public class CountOddSumPairs {
	public static void main(String[] args) {
		int array1[] = { 4, 6, 13, 25 };
		int array2[] = { 3, 8, 13, 5, 18 };
		int totalPairs = getCount(array1, array2);
		System.out.println("Total pairs " + totalPairs);
	}

	static int getCount(int[] array1, int[] array2) {
		int odd1 = 0;
		int even1 = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0)
				even1++;
			else
				odd1++;
		}

		int odd2 = 0;
		int even2 = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0)
				even2++;
			else
				odd2++;
		}

		return min(odd1, even2) + min(odd2, even1);

	}

	static int min(int first, int second) {
		if (first < second)
			return first;
		else
			return second;
	}
}
