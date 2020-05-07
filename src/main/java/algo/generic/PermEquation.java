package algo.generic;

public class PermEquation {
	public static void main(String[] args) {
		int array[] = { 4, 5, 6, 2, 1, 3 };
		int out[] = permutationEquation(array);
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
	}

	static int[] permutationEquation(int[] p) {
		int n = p.length;
		int out[] = new int[n];
		for (int i = 0; i < n; i++) {
			int searchVal = i + 1;
			search(p, out, searchVal, 1, i);
		}
		return out;
	}

	static void search(int[] p, int[] out, int val, int count, int fillIndex) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == val) {
				if (count == 2) {
					out[fillIndex] = i + 1;
					break;
				} else {
					count = count + 1;
					search(p, out, i + 1, count, fillIndex);
				}
			}
		}
	}

}
