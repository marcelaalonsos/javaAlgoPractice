/*
 * given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target
 * return the sum of the three integers
 */

import java.util.Arrays;

class Solution {
  public int threeSumClosest(int[] nums, int target) {
    //sort the input array
    Arrays.sort(nums);
    //set variable to save the closest sum
    int closest = Integer.MAX_VALUE;
    //iterate through array, length minus 2
    for (int i = 0; i < nums.length - 2; i++){
      //set left and right pointers
      int left = i + 1;
      int right = nums.length - 1;
      while(left < right){
        //sum the fixed element i to the left and right pointers
        int trio = nums[i] + nums[left] + nums[right];
        //if the abs value of target - closest is larger than the abs value of target - trio
        if(Math.abs(target-closest) > Math.abs(target-trio)){
          //then set the closest to the trio
          closest = trio;
        }
        //if the target is larger than the trio
        if (trio < target){
          //move the left pointer up
          left++;
        } else {
          //else move the right pointer down
          right--;
        }
      }
    }
    //return the closest
    return closest;
  }
}
