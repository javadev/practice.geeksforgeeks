/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N2_Sort_a_binary_array {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    int array[] = new int[length];
    	    for (int i = 0; i < length; i += 1) {
    	        array[i] = scanner.nextInt();
    	    }
            Arrays.sort(array);
    	    for (int i = 0; i < length; i += 1) {
    	        System.out.print(array[i] + " ");
    	    }
    	    System.out.println();
        }
    }
}
