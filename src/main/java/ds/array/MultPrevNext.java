package ds.array;

public class MultPrevNext {
	public static void main(String[] args) {
		int[] input = { 5, 13, 33, 21, 12, 9 };
		input = getArray(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println("element " + i + " : " + input[i]);
		}
	}

	public static int[] getArray(int[] input) {
		int prev = 0;
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				prev = input[0];
				input[0] = input[0] * input[1];
			} else if (i == input.length - 1) {
				input[i] = prev * input[i];
			} else {
				int temp = input[i];
				input[i] = prev * input[i + 1];
				prev = temp;
			}
		}
		return input;

	}
}
