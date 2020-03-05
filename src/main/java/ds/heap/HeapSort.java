package ds.heap;

public class HeapSort extends Heap {
	public static void main(String[] args) {
		int[] heapArray = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		Heap heap = new Heap();
		buildHeap(heapArray, heapArray.length);
		heapSort(heapArray, heapArray.length);
		for (int i = 0; i < heapArray.length; i++)
			System.out.println(heapArray[i]);
	}

	public static void heapSort(int[] array, int n) {
		for (int i = n - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapify(array, 0, i);
		}
	}
}
