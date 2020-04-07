package algo.greedy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int pickingNumbers(List<Integer> a) {
           Collections.sort(a);
           int alength=a.size();

           int prev=a.get(0);
           int count =1;
           int result=1;
           for(int i=1;i<alength;i++){
              int diff=a.get(i)-prev;
              if(diff<=1){
                  count++;
              }else{
                  if(count >result)
                  result=count;
                  count=1;
                  prev=a.get(i);
              }

           }
        if(count>result)
          return count;
        else 
          return result;
    }

}

public class PickingNumbersHackerRank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\\\path"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
