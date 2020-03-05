package codility;
//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class RoatateArray {
 public int[] solution(int[] A, int K) {
     // write your code in Java SE 8
     
     for(int i=0;i<K;i++){
         int temp=0;
         for(int j=A.length-1;j>=0;j--){
             if(j==0){
             A[j]=temp;
             }
             else if(j==A.length-1){
                 temp=A[j];
                  A[j]=A[j-1];
             }
             else
             A[j]=A[j-1];   
         }
     }
     return A;
 }
 
 
}