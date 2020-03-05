package algo.dp;

public class LCSPrint {
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		char[] charS1 = s1.toCharArray();
		char[] charS2 = s2.toCharArray();
		printLCS(charS1, charS2, charS1.length, charS2.length);

	}

	public static void printLCS(char[] charS1, char[] charS2, int m, int n) {
		int[][] lcsLength = new int[m + 1][n + 1];
		int i, j = 0;
		for (i = 0; i <= m; i++)
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					lcsLength[i][j] = 0;
				else if (charS1[i - 1] == charS2[j - 1]) {
					lcsLength[i][j] = lcsLength[i - 1][j - 1] + 1;
				} else {
					lcsLength[i][j] = Math.max(lcsLength[i - 1][j], lcsLength[i][j - 1]);
				}
			}
		int index = lcsLength[m][n];
		char[] lcsString = new char[index];
		while (m > 0 && n > 0) {
			if (charS1[m - 1] == charS2[n - 1]) {
				lcsString[index - 1] = charS1[m - 1];
				m--;
				n--;
				index--;
			} else if (lcsLength[m - 1][n] > lcsLength[m][n - 1])
				m--;
			else
				n--;
		}
		for (int k = 0; k < lcsString.length; k++) {
			System.out.println(lcsString[k]);
		}
	}
}
