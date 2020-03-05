package ds.heap;

public class Heap {

	public static void main(String[] args) {
		int[] heapArray = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		buildHeap(heapArray, heapArray.length);
		for (int i = 0; i < heapArray.length; i++)
			System.out.println(heapArray[i]);
	}

	public static void buildHeap(int[] array, int n) {
		int totalIter = (n / 2) - 1;
		for (int i = totalIter; i >= 0; i--)
			heapify(array, i, n);
	}

	public static void heapify(int[] array, int totalIter, int n) {
		int largest = totalIter;
		int l = 2 * totalIter + 1;
		int r = 2 * totalIter + 2;
		if (l < n && array[l] > array[largest]) {
			largest = l;
		}
		if (r < n && array[r] > array[largest]) {
			largest = r;
		}
		if (largest != totalIter) {
			int swap = array[totalIter];
			array[totalIter] = array[largest];
			array[largest] = swap;
			heapify(array, largest, n);
		}
	}
}
