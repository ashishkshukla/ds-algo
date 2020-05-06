package ds.array;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRoatationHackerRank {
	public static void main(String[] args) {
		int a[] = { 23, 44, 11, 21, 22 };
		int k = 2;
		int[] queries = { 1, 4, 2 };
		int[] values = circularArrayRotation(a, k, queries);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int out[] = new int[queries.length];
		int n = a.length;
		int finalRotate = k % n;
		if (finalRotate != 0) {
			List<Integer> tempList = new ArrayList<Integer>();
			for (int j = n - 1; j >= n - finalRotate; j--) {
				tempList.add(a[j]);
			}
			for (int j = n - 1; j >= finalRotate - 1; j--) {
				if ((j - finalRotate) >= 0)
					a[j] = a[j - finalRotate];
			}
			int index = 0;
			for (int i = tempList.size() - 1; i >= 0; i--) {
				a[index] = tempList.get(i);
				index++;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			out[i] = a[queries[i]];
		}

		return out;

	}
}
