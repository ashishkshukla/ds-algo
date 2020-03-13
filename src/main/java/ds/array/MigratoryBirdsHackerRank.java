package ds.array;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MigratoryBirdsHackerRank {

    static int migratoryBirds(List<Integer> arr) {
          int[] count= new int[5];

          for(int i=0;i<arr.size();i++){
              int val=arr.get(i);
              count[val-1]=count[val-1]+1;
          }
        int index=0;
        int max=count[index];
        for(int i=1;i<5;i++){
            if(count[i]>max){
            index=i;
            max=count[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
