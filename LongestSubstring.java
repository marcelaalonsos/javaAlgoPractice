/*
 * given a string s, find the length of the longest substring without repeating characters
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int longestSubstring(String s) {
    int n = s.length();
    int max = 0;
    //set to keep track of chars in substring
    Set<Character> charSet = new HashSet<>();
    //left and right pointers
    int left = 0;
    //iterate through the string using the right pointer
    for(int right = 0; right < n; right++) {
      //check if the char is not in the set
      if (!charSet.contains(s.charAt(right))) {
        //add to set and update max
        charSet.add(s.charAt(right));
        max = Math.max(max, right - left + 1);
      } else {
        //remove the chars from the set until the repeating char is no longer present and move left up
        while(charSet.contains(s.charAt(right))) {
          charSet.remove(s.charAt(left));
          left++;
        }
        //insert current char into the set
        charSet.add(s.charAt(right));
      }
    }
    return max;
  }
}
