/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N_Maximum_Index {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    int sum = scanner.nextInt();
    	    int array[] = new int[length];
    	    for (int i = 0; i < length; i += 1) {
    	        array[i] = scanner.nextInt();
    	    }
    	    System.out.println(maxIndexDiff(array, length));
        }
	}

    private static int max(int x, int y)  
    { 
        return x > y ? x : y; 
    } 
  
    private static int min(int x, int y)  
    { 
        return x < y ? x : y; 
    }
    
    private static int maxIndexDiff( int[] array, int n )
    {
        int maxDiff; 
        int i, j; 
  
        int RMax[] = new int[n]; 
        int LMin[] = new int[n]; 
  
        /* Construct LMin[] such that LMin[i] stores the minimum value 
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = array[0]; 
        for (i = 1; i < n; ++i) 
            LMin[i] = min(array[i], LMin[i - 1]); 
  
        /* Construct RMax[] such that RMax[j] stores the maximum value 
           from (array[j], array[j+1], ..array[n-1]) */
        RMax[n - 1] = array[n - 1]; 
        for (j = n - 2; j >= 0; --j) 
            RMax[j] = max(array[j], RMax[j + 1]); 
  
        /* Traverse both arrays from left to right to find optimum j - i 
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = 0; 
        while (j < n && i < n)  
        { 
            if (LMin[i] <= RMax[j])  
            { 
                maxDiff = max(maxDiff, j - i); 
                j = j + 1; 
            }  
            else 
                i = i + 1; 
        } 
  
        return maxDiff; 
    }
}
