package algo.generic;

import java.math.BigInteger;

public class ExtraLongFactorialHackerRank {
	public static void main(String[] args) {
       calculateFactorial(25);
	}

	static void calculateFactorial(int n) {
		BigInteger num = new BigInteger(String.valueOf(n));
		BigInteger factValue = calculate(num);
		System.out.println(factValue.toString());
	}

	static BigInteger calculate(BigInteger n) {
		if (n.intValue() == 1)
			return new BigInteger("1");
		else
			return n.multiply(calculate(new BigInteger(String.valueOf(n.intValue() - 1))));

	}
}
