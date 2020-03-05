package codility;
//you can also use imports, for example:
import java.util.*;

class Solution {
 public int solution(int N) {
     // write your code in Java SE 8
    // System.out.println("hello");
    List<Integer> binaryList=new ArrayList<Integer>();
    while(N>0){
       binaryList.add(N%2);
        N=N/2;
        
    }
   while(binaryList.get(0)==0){
       binaryList.remove(0);
   }
    while(binaryList.get(binaryList.size()-1)==0){
       binaryList.remove(0);
   }
   
   //System.out.println(binaryList);
   
   int maxLength=0;
   int tempMax=0;
   int index=0;
   while (index<binaryList.size()){
       if(binaryList.get(index)==1){
           if(tempMax>maxLength)
           maxLength=tempMax;
           tempMax=0;
       }else{
          tempMax=tempMax+1; 
       }
       
       index++;
   }
     return maxLength;
 }
}
