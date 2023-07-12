/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining
 */

class Solution {
  public int trap(int[] height) {
    int n = height.length;
    //initialize right and left pointers to the first and last bars of the array
    //initialize left_max and right_max to zero
    //initialize water variable to zero
    int left = 0, right = n - 1, left_max = 0, right_max = 0, water = 0;
    while (left <= right) {
      //if the height of the left bar is less or equal to the height of the right bar
      if(height[left] <= height[right]){
        //if the height of the left bar is greater than the left_max, update left_max
        if (height[left] > left_max) left_max = height[left];
        //otherwise add left_max - height[left] to the water and move left to the next bar
        else water += left_max - height[left];
        left++;
      } else {
        //if the height of the right bar is greater than the right_max, update right_max
        if (height[right] > right_max) right_max = height[right];
        //otherwise add right_max - height[right] to the water, move right to the previous bar
        else water += right_max - height[right];
        right--;
      }
    }
    return water;
  }
}
