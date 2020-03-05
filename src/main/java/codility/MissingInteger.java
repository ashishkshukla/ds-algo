package codility;
//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class MissingInteger {
 public int solution(int[] A) {
     // write your code in Java SE 8
     Arrays.sort(A);
     int returnVal=1;
     int prevVal=0;
     int alength=A.length;
     if(A[alength-1]<=0)
     return 1;
     for(int i=0;i<alength;i++){
         if(i==0 && A[i]>1 )
         return 1;
         
         if(A[i]<0)
         continue;
         
         if(A[i]>=0 &&(A[i]==prevVal||A[i]==prevVal+1)){
             prevVal=A[i];
         }else {
             return prevVal+1;
         }
     }
  return A[alength-1]+1;
 } 
}