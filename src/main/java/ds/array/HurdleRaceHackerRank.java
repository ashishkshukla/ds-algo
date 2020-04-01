package ds.array;
import java.io.*;
import java.util.Scanner;

public class HurdleRaceHackerRank {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
          int hlength=height.length;
          int maxDose=0;

          for(int i=0;i<hlength;i++){
              if(height[i]>k ){
             int tempDose=height[i]-k;
                  if(tempDose>maxDose)
              maxDose=height[i]-k;
              }
          }
        return maxDose;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\\\path"));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
