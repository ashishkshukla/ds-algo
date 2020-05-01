package algo.generic;

public class UtopianTreeHackerRank {

	public static void main(String[] args) {
		
		int growCycles = 1;
		int height = utopianTree(growCycles);
		System.out.println(height);
		int i=001;
		System.err.println(i);
	}

	static int utopianTree(int n) {
		int treeHeight = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				treeHeight += 1;
			else
				treeHeight *= 2;
		}
		return treeHeight;
	}
}
