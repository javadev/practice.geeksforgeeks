/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N1_Transpose_of_Matrix {
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
	        int result[][] = transpose(array);
	        for (int i = 0; i < result.length; i += 1) {
    	        for (int j = 0; j < result[0].length; j += 1) {
    	            System.out.print(result[i][j] + " ");
    	        }
    	    }
    	    System.out.println();
        }
	}

    static int[][] transpose(int[][] m) {
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }
}
