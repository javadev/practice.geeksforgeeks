/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N_Smallest_Positive_missing_number {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int index = 0; index < count; index += 1) {
    	    int length = scanner.nextInt();
    	    int array[] = new int[length];
    	    for (int i = 0; i < length; i += 1) {
    	        array[i] = scanner.nextInt();
    	    }
    	    System.out.println(findNumber(array));
        }

	}
	
	private static int findNumber(int[] array) {
      Map<Integer, Boolean> result = new HashMap<>();
    
      for (int i = 0; i < array.length; ++i) {
        if (0 <= array[i]) {
          result.put(array[i], true);
        }
      }
    
      for (int i = 1; i <= result.size(); ++i) {
        if (!result.containsKey(i)) {
          return i;
        }
      }
    
      return 1;
	}
}
