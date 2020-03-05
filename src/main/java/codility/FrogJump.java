package codility;

public class FrogJump {
	  public int solution(int X, int Y, int D) {
	        // write your code in Java SE 8
	        int distanceToCover=Y-X;
	        if(distanceToCover==0)
	        return 0;
	        
	        if(distanceToCover<=D)
	        return 1;
	        
	        int totalJumps=distanceToCover/D;
	        if(distanceToCover%D==0)
	        return totalJumps;
	        else 
	        {
	            totalJumps=totalJumps+1;
	            return totalJumps;
	        }
	        
	    }
}
