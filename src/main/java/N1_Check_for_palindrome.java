/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N1_Check_for_palindrome {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    scanner.nextInt();
    	    String line = scanner.next();
            if (new StringBuilder(line).reverse().toString().equals(line)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
