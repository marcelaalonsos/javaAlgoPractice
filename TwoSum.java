/*
 * Given an array of integer nums and an integer target, return the indices of the two numbers that they add up to the target
 * you may assume that each input would have exactly one solution, and you may not use the same element twice
 * you can return the answer in any order
 */

class Solution {
  public int[] twoSum(int[] nums, int target) {
    //get the length of the array
    int len = nums.length;
    //the outer loop goes from the first element to the second to last
    for (int i = 0; i < len -1; i++){
      //the inner loop goes from the second element to the last
      for (int j = i + 1; i < len; j++){
        //if their sum is equal to the target
        if (nums[i] + nums[j] == target) {
          //return a new array with those indices
          return new int[] {i, j};
        }
      }
    }
    //else return an empty array
    return new int[]{};
  }
}
