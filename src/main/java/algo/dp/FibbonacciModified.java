package algo.dp;

import java.math.BigDecimal;

public class FibbonacciModified {
	public static void main(String[] args) {
		int t1 = 0;
		int t2 = 1;
		int n = 12;
		System.out.println(String.valueOf(fibonacciModified(t1, t2, n)));
	}

	static BigDecimal fibonacciModified(int t1, int t2, int n) {
		BigDecimal b1 = new BigDecimal(t1);
		BigDecimal b2 = new BigDecimal(t2);

		BigDecimal[] fibSum = new BigDecimal[n];
		for (int i = 0; i < n; i++) {
			if (i == 0)
				fibSum[i] = b1;
			else if (i == 1)
				fibSum[i] = b2;
			else {
				fibSum[i] = fibSum[i - 2].add(fibSum[i - 1].multiply(fibSum[i - 1]));
				System.out.println(fibSum[i]);
			}
		}
	String s="^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
  "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
  "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
  "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	System.out.println(s);
	System.out.println("55.255.255.255.".matches(s));
		return fibSum[n - 1];
	}

}
