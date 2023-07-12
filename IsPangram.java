/*
 * Given a string sentence containing only lowercase english letters, return true, if sentence is a pangram or false otherwise
 */

/*
 * approach: looping
 * 1. create a new int array of 26 lenght
 * 2. using a for of loop, loop through the sentence finding a char c for(char c: sentence.toCharArray())
 * 3. increase the char at the array - 'a' by 1
 * 4. using a for of loop to check the frequency in the array
 * 5. if the frequency is 0, then return false
 * 6. otherwise return true
 */

class Solution {
  public static boolean isPangram(String sentence) {
    int [] charCount = new int[26];
    for (char c : sentence.toCharArray()) {
      charCount[c - 'a']++;
    }
    for (int frequency : charCount) {
      if(frequency == 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String test = "a fox jumped over the box";
    System.out.println(isPangram(test));
  }
}
