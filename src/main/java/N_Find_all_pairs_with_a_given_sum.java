/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N_Find_all_pairs_with_a_given_sum {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length1 = scanner.nextInt();
    	    int length2 = scanner.nextInt();
    	    int sum = scanner.nextInt();
    	    int array1[] = new int[length1];
    	    for (int i = 0; i < length1; i += 1) {
    	        array1[i] = scanner.nextInt();
    	    }
    	    int array2[] = new int[length2];
    	    for (int i = 0; i < length2; i += 1) {
    	        array2[i] = scanner.nextInt();
    	    }
    	    findPairs(array1, array2, length1, length2, sum);
        }
	}
	
	static void findPairs(int arr1[], int arr2[], int n, 
                                           int m, int x) 
    { 
        int index = 0;
        List<int[]> pairs = new ArrayList<>();
        // Insert all elements of first array in a hash 
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>(); 
          
        for (int i = 0; i < n; i ++) 
            s.put(arr1[i], 0); 
       
        // Subtract sum from second array elements one 
        // by one and check it's present in array first 
        // or not 
        for (int j = 0; j < m; j ++)  {
            if (s.containsKey(x - arr2[j]))  {
                pairs.add(new int[] {x - arr2[j], arr2[j]});
                index += 1;
            }
        }
        if (index == 0) {
            System.out.print("-1");
        } else {
            Collections.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
            int index2 = 0;
            for (int[] pair : pairs) {
                if (index2 > 0) {
                    System.out.print(", ");
                }
                System.out.print(pair[0] + " " + pair[1]);
                index2 += 1;
            }
        }
        System.out.println();
    } 
}
