/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise
 */

/*
 * Approach: sorting
 * 1. create an array of characters for the string s and t
 * 2. sort each array
 * 3. return true is the Arrays.equals() equates to true
 * otherwise, if the sorted strings are not equal, the function returns false
 */

//time complexity: O(n log n) because of sorting

import java.util.Arrays;

class Soluton {
  public static boolean isAnagram(String s, String t) {
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

    Arrays.sort(sChars);
    Arrays.sort(tChars);

    return Arrays.equals(sChars, tChars);
  }

  public static void main(String[] args) {
    String one = "anagram";
    String two = "nagaram";
    System.out.println(isAnagram(one, two));
  }
}
