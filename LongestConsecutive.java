//given an unsorted array of integers nums, return the length of the longest consecutive elements sequence

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int longestConsecutive(int[] nums) {
    //create a hash set
    Set<Integer> set = new HashSet<Integer>();
    //iterate through array
    for (int n : nums) {
      //add n to map
      set.add(n);
    }
    //initialize streak to 0
    int streak = 0;
    //iterate through the array again and check if the map contains the current n - 1
    for (int n : nums) {
      if(!set.contains(n - 1)){
        //set currentNum to n and set currentStreak to 1
        int currNum = n;
        int currStreak = 1;
        //if the set includes the currentNum + 1, increase the currNum and currStreak by 1
        while(set.contains(currNum + 1)) {
          //remove the currNum since we are looking for the next element to save space in memory
          set.remove(currNum);
          currNum++;
          currStreak++;
        }
        //get the max value between streak and currStreak
        streak = Math.max(streak, currStreak);
      }
    }
    return streak;
  }
}
