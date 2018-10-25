/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N1_Count_distinct_elements {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    int array[][] = new int[length][length];
    	    for (int i = 0; i < length; i += 1) {
    	        for (int j = 0; j < length; j += 1) {
    	            array[i][j] = scanner.nextInt();
    	        }
    	    }
	        printCommonElements(array, length, length);
        }
	}

    static void printCommonElements(int mat[][], int M, int N) {
		Map<Integer, Integer> mp = new HashMap<>();
		// initalize 1st row elements with value 1
		for (int j = 0; j < N; j++) 
				mp.put(mat[0][j], 1);
 
		// traverse the matrix
		int count = 0;
		for (int i = 1; i < M; i++) {
			for (int j = 0; j < N; j++) {
				// If element is present in the map and
				// is not duplicated in current row.
				if (mp.containsKey(mat[i][j]) && mp.get(mat[i][j]) == i) {
					// increment count of the element in map by 1
					mp.put(mat[i][j], i + 1);
					if (i == M - 1) {
					    count += 1;
					}
				}
			}
		}
		System.out.println(count);
    } 
}
