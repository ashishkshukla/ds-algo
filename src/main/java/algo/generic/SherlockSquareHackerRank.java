package algo.generic;

public class SherlockSquareHackerRank {
	public static void main(String[] args) {
    System.out.println(squares(100,1000));
	}

	static int squares(int a, int b) {
		int count = 0;
		int startValue = a;
		int nextValue = 1;
		for (int i = a; i <= b; i++) {
			startValue = i;
			double squrRoot = Math.sqrt(i);
			int intsqurRoot = (int) squrRoot;

			if (intsqurRoot == squrRoot) {
				count += 1;
				nextValue = intsqurRoot + 1;
				break;
			}
		}

		while (startValue < b) {
			int squareVal = nextValue * nextValue;
			if (squareVal <= b) {
				count = count + 1;
				startValue = squareVal;
				nextValue = nextValue + 1;
			}else {
				break;
			}
		}

		return count;
	}

}
