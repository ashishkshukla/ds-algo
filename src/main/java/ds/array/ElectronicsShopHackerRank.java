package ds.array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShopHackerRank {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int klength=keyboards.length;
        int dlength=drives.length;
        int i=0;
        int j=dlength-1;
        int mspent=-1;
        while(i<klength && j>=0){
            int midSum=keyboards[i]+drives[j];
           if(midSum>b){
               j--;
           }else if(midSum<b){
                if(midSum>mspent)
                mspent=midSum;
                i++;
           }else{
               mspent=b;
               break;
           }
        }
      return mspent;
    }
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\path"));

	        String[] bnm = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

	        int b = Integer.parseInt(bnm[0]);

	        int n = Integer.parseInt(bnm[1]);

	        int m = Integer.parseInt(bnm[2]);

	        int[] keyboards = new int[n];

	        String[] keyboardsItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

	        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
	            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
	            keyboards[keyboardsItr] = keyboardsItem;
	        }

	        int[] drives = new int[m];

	        String[] drivesItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

	        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
	            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
	            drives[drivesItr] = drivesItem;
	        }

	        /*
	         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
	         */

	        int moneySpent = getMoneySpent(keyboards, drives, b);

	        bufferedWriter.write(String.valueOf(moneySpent));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
}
