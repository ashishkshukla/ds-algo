package algo.dp;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		char[] charS1 = s1.toCharArray();
		char[] charS2 = s2.toCharArray();
		System.out.println(getLCSLength(charS1, charS2, charS1.length, charS2.length));

	}

	public static int getLCSLength(char[] charS1, char[] charS2, int m, int n) {
		int[][] lcsLength = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++)
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					lcsLength[i][j] = 0;
				else if (charS1[i - 1] == charS2[j - 1]) {
					lcsLength[i][j] = lcsLength[i - 1][j - 1] + 1;
				} else {
					lcsLength[i][j] = Math.max(lcsLength[i - 1][j], lcsLength[i][j - 1]);
				}
			}
		return lcsLength[m][n];
	}
}
