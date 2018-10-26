/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class N2_Check_for_anagram {

    public static void main(String[] args) {
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

    private static boolean anagram(String s, String t) {
        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
