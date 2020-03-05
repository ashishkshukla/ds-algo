package codility;

public class TapeEquilibrium {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int alength=A.length;
        if(alength==2){
            if(A[0]>A[1])
            return A[0]-A[1];
            else
            return A[1]-A[0];
        }
        
        int rightSum=0;
        int leftSum=0;
        for(int i=0;i<alength;i++){
            rightSum=rightSum+A[i];
        }
        
        int minDiff=Integer.MAX_VALUE;
        int tempDiff;
        for(int j=0;j<alength-1;j++){
            rightSum=rightSum-A[j];
            leftSum=leftSum+A[j];
            
            if(rightSum>leftSum){
                tempDiff=rightSum-leftSum;
                
            }else{
                tempDiff=leftSum-rightSum;
            }
            if(tempDiff<minDiff)
            minDiff=tempDiff;
        }
        
        return minDiff;
    }
}
