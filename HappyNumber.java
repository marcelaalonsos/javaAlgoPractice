/*
 * write an algorithm to determine if a number n is happy
 * a happy number is defined by the following process:
 * starting with a positive integer, replace the number by the sum of the squares of its digits
 * repeat the process until the number equals 1 (where it will stay) or it loops endlessly in a cycle which does not include 1
 * those numbers for which this process ends in 1 are happy
 * return true if n is a happy number and false if not
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean isHappy(int n) {
    //create a hash set
    Set<Integer> hset = new HashSet<Integer>();
    //if the number is not in the set, add it
    while(hset.add(n)) {
      //initialize total variable
      int total = 0;
      while (n > 0) {
        //use modulo division to take digits off the number until none remain
        //square them and add them together
        total += (n % 10) * (n % 10);
        n /= 10;
        //each new converted number must not had occurred before
      }
      //if total is equal to 1, return true
      if (total == 1) {
        return true;
        //insert the current number into the set
        //replace the current number with total of the square of its digits
      } else {
        n = total;
      }
    }
    //if the current number is already in the set, that means it's in a cycle and it should return false
    return false;
  }
}
