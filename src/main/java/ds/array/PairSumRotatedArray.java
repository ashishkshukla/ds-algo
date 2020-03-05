package ds.array;

public class PairSumRotatedArray {
	public static void main(String[] args) {

		int[] inputArray = { 12, 15, 6, 8, 9, 10 };
		int sum = 16;
		int index = findRotateIndex(inputArray, 0, inputArray.length - 1);
		int left = index + 1;
		int right = index;
		findPair(inputArray, left, right, sum);
	}

	public static void findPair(int[] array, int left, int right, int sum) {
		while (left != right) {
			int medSum = array[left] + array[right];
			if (medSum == sum) {
				System.out.println("sum is found for pair " + array[left]  + " , " + array[right]);
				return;
			}else if(medSum>sum){
				right--;
				if(right==-1)
					right=array.length-1;
			}else{
				left++;
				if(left==array.length)
					left=0;
			}
            
		}
	}

	public static int findRotateIndex(int[] array, int startIndex, int endIndex) {
		if (startIndex <= endIndex) {
			int mid = (startIndex + endIndex) / 2;
			if (mid == array.length - 1)
				return -1;
			if (array[mid] > array[mid + 1])
				return mid;

			if (array[startIndex] > array[mid])
				return findRotateIndex(array, startIndex, mid - 1);
			else
				return findRotateIndex(array, mid + 1, endIndex);
		}
		return -1;
	}
}
