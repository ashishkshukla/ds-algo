package codility;

import java.util.Arrays;

public class PermMissingElement {
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	         Arrays.sort(A);
	        int aLength=A.length;
	        if(aLength==0)
	        return 1;
	        int prevVal=0;
	      for(int i=0;i<aLength;i++){
	          if(i==0){
	           prevVal=A[i];   
	          }else if(A[i]==prevVal+1){
	              prevVal=A[i];
	          }else{
	              return prevVal+1;
	          }
	          
	      }
	      if(A[0]==1)
	      return A[aLength-1]+1;
	      else
	      return 1;
	    }
}
