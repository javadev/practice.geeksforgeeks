/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N6_Reverse_an_Array {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    List<Integer> list = new ArrayList<>();
    	    for (int index2 = 0; index2 < length; index2 += 1) { 
              list.add(scanner.nextInt());
    	    }
            Collections.reverse(list);
            for (Integer item : list) {
                System.out.print(item);
                System.out.print(" ");
            }
            System.out.println();
        }
	}
}
