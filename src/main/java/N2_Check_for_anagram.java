/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N2_Check_for_anagram {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    String line1 = scanner.next();
    	    String line2 = scanner.next();
            if (anagram(line1, line2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
	
	public static boolean anagram(String s, String t) {
        if(s.length() != t.length())
            return false;
    
        int value = 0;
        for(int i = 0; i < s.length(); i++){
            value += ((int)s.charAt(i))^2;
            value -= ((int)t.charAt(i))^2;
        }
        return value == 0;
    }
}
