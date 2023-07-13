/*
 * given a string s, return true if it is a palindrome or false otherwise
 */

class Solution {
  public boolean isPalindrome(String s) {
    //make all chars toLowerCase and remove all non-alphanumeric chars
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    //set the pointers
    int start = 0;
    int end = s.length() - 1;
    //iterate through the string
    while (start <= end) {
      //check if the characters match
      if (s.charAt(start) != s.charAt(end)) {
        //return false if not
        return false;
      }
      //move the pointers
      start++;
      end--;
    }
    return true;
  }
}
