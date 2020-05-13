package algo.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutSticksHackerRank {
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 3, 3, 2, 1 };
		int[] out = cutTheSticks(inputArray);
		for (int indexVal : out) {
			System.out.println(indexVal);
		}

	}

	static int[] cutTheSticks(int[] arr) {
		Arrays.sort(arr);
		int index = 0;
		List<Integer> outList = new ArrayList<Integer>();
		while (index < arr.length) {
			int count = 0;
			int tempIndex = index;
			int cutVal = arr[index];
			for (int i = index; i < arr.length; i++) {
				int remainingCut = arr[i] - cutVal;
				arr[i] = remainingCut;
				count++;
				if (remainingCut == 0)
					tempIndex = tempIndex + 1;
			}
			index = tempIndex;
			outList.add(count);

		}

		int[] out = new int[outList.size()];
		for (int i = 0; i < outList.size(); i++) {
			out[i] = outList.get(i);
		}
		return out;

	}
}
