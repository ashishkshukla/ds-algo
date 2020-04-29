package ds.array;

public class DivisibleSumPairsHackerRank {
	public static void main(String[] args) {
       int[] array= {1,3,4,6,2,4,5,3};
       int n=array.length;
       int k=3;
       int totalPairs=computePairs(n, k, array);
       System.out.println(totalPairs);
	}

	public static int computePairs(int n, int k, int[] ar) {
		int totalPairs = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int tempSum = ar[i] + ar[j];
				if (tempSum % k == 0)
					totalPairs += 1;
			}
		}
		return totalPairs;
	}
}
