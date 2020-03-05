package algo.dp;

public class LCSHackerRank {
	public static void main(String[] args) {
		int first[] = { 1, 2, 3, 4, 1 };
		int second[] = { 3, 4, 1, 2, 1, 3 };

		int[] subsequence = longestCommonSubsequence(first, second);
		for (int i = 0; i < subsequence.length; i++)
			System.out.print(subsequence[i]);
	}

	static int[] longestCommonSubsequence(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[][] lengthLCS = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++)
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					lengthLCS[i][j] = 0;
				else if (a[i - 1] == b[j - 1])
					lengthLCS[i][j] = lengthLCS[i - 1][j - 1] + 1;
				else
					lengthLCS[i][j] = Math.max(lengthLCS[i - 1][j], lengthLCS[i][j - 1]);
			}
		System.out.println(lengthLCS[m][n]);
		int index = lengthLCS[m][n];
		int[] arrayLCS = new int[index];

		while (m > 0 && n > 0) {
			if (a[m - 1] == b[n - 1]) {
				arrayLCS[index - 1] = a[m - 1];
				m--;
				n--;
				index--;
			} else if (lengthLCS[m - 1][n] > lengthLCS[m][n - 1])
				m--;
			else
				n--;
		}

		return arrayLCS;
	}

}
