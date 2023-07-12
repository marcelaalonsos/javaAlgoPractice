/*
 * given 2 integer arrays, nums1 and nums2, sorted in ascending order, and two integers m and n, representing the number of elements in nums1 and nums2
 * merge nums1 and nums2 into a single array in ascending order
 * - the final sorted array should not be returned by the funciton but instead be saved inside array nums1
 */

import java.util.Arrays;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    //initialize a variable n2 to store the value of n
    int n2 = n;
    //iterate through n
    for (int i = 0; i < n; i++){
      //set nums1[m + i] to nums2[n2 -1] to merge the elements from the arrys
      nums1[m + i] = nums2[n2 -1];
      //check if n2 is less than or equal to 0, if so return from the function
      while(n2 < 0) {
        return;
      }
      //decrement n2 by 1
      n2--;
    }
    //sort nums1 array
    Arrays.sort(nums1);
  }
}
