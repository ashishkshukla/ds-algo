package ds.string;

public class PDFViewer {
	public static void main(String[] args) {
		String word = "zaba";
		int[] h = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 };
		int wordArea = designerPdfViewer(h, word);
		System.out.println(wordArea);

	}

	static int designerPdfViewer(int[] h, String word) {
		int n = word.length();
		int height = 1;
		for (int i = 0; i < n; i++) {
			int charHeightIndex = word.charAt(i) - 'a';
			if (height < h[charHeightIndex])
				height = h[charHeightIndex];
		}

		int area = n * height;
		return area;
	}

}
