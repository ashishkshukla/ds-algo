package ds.sorting;

public class MergeSort {
	public static void main(String[] args) {
         int [] inputArray={12,33,42,11,22,31,13,23};
         sort(inputArray,0,inputArray.length-1);
         for (int i=0; i<inputArray.length;i++){
        	 System.out.println(inputArray[i]);
         }
	}
	
	public static void  sort(int[] inputArray, int lowerbound, int upperbound){

        if (lowerbound < upperbound) 
        { 
            int m = (lowerbound+upperbound)/2; 
  
            sort(inputArray, lowerbound, m); 
            sort(inputArray , m+1, upperbound); 
  
            merge(inputArray, lowerbound, m, upperbound); 
        } 
	}
	public static void merge(int arr[], int l, int m, int r) 
	    { 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        int i = 0, j = 0; 
	  
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
}
