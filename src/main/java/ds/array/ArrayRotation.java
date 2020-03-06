package ds.array;

import java.util.*;

public class ArrayRotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int index = 0;
		int countRotate = d % n;
		List<Integer> rightArray = new ArrayList<Integer>();

		while (index != a.length) {

			if (index < countRotate)
				rightArray.add(a[index]);
			else {
				a[index - countRotate] = a[index];
			}
			index++;
		}
		int startIndex = a.length - countRotate;
		for (int j = 0; j < rightArray.size(); j++) {
			a[startIndex + j] = rightArray.get(j);
		}
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");
		scanner.close();
	}
}
