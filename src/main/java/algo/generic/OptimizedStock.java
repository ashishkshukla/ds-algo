package algo.generic;

public class OptimizedStock {
	public static void main(String[] args) {
		int initialStock = 3;
		int finalStock = 11;
		int countDays = compute(initialStock, finalStock);
		System.out.println(countDays);
	}

	public static int compute(int startStock, int endStock) {
		if (startStock > endStock)
			return (startStock - endStock);
		
		if (startStock == endStock)
			return 0;

		if (endStock % 2 == 0) {
			return 1 + compute(startStock, endStock / 2);
		} else {
			return 1 + compute(startStock, endStock + 1);
		}

	}
}
