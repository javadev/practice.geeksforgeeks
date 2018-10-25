/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N1_Linear_Search {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    int number = scanner.nextInt();
    	    boolean found = false;
    	    for (int index2 = 0; index2 < length; index2 += 1) {
	            if (number == scanner.nextInt()) {
	               if (!found) {
                       found = true;
	                   System.out.println(index2 + 1);
	                   scanner.nextLine();
	                   break;
	               }
	            }
    	    }
    	    if (!found) {
               System.out.println(-1);  	        
    	    }
        }
    }
}
