/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N1_Check_if_array_is_sorted {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    int array[] = new int[length];
    	    for (int i = 0; i < length; i += 1) {
    	        array[i] = scanner.nextInt();
    	    }
    	    boolean isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    System.out.println(0);
                    break;
                }
            }
            if (isSorted) {
                System.out.println(1);
            }
        }
    }
}
