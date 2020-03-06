package ds.array;

import java.io.*;
import java.util.*;

public class LarryArrayHackerRank {

	static String larrysArray(int[] A) {
		int alength = A.length;
		int index = 0;
		int searchVal = 1;
		while (index <= alength && searchVal != alength - 2) {
			
			if (A[index] == searchVal) {

				if (searchVal == index + 1) {
					index++;
					searchVal++;
				} else if(index-2==-1) {
					int temp = A[index - 1];
					A[index - 1] = A[index];
					A[index] = A[index + 1];
					A[index + 1] = temp;
					index--;
				}else{
					if (A[index - 2] == searchVal-1) {
						int temp = A[index - 1];
						A[index - 1] = A[index];
						A[index] = A[index + 1];
						A[index + 1] = temp;
					} else {
						int temp = A[index - 2];
						A[index - 2] = A[index - 1];
						A[index - 1] = A[index];
						A[index] = temp;
					}
					index--;
				}

			} else
				index++;

		}
		
		int count =1;
		while(count<=3){
			if(A[index]==searchVal&& A[index+1]==searchVal+1&&A[index+2]==searchVal+2)
				return "YES";
			else{
				int temp=A[index];
				A[index]=A[index+1];
				A[index+1]=A[index+2];
				A[index+2]=temp;
				count++;
			}
		}
		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\path"));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] A = new int[n];

			String[] AItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int AItem = Integer.parseInt(AItems[i]);
				A[i] = AItem;
			}

			String result = larrysArray(A);
            
			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
