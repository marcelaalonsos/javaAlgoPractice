/*
 * Given an integer array nums and integer k, return the kth largest element in the array
 * Note that it is the kth largest in the sorted order, not the kth distinct element
 * example:
 * input: nums = [3,2,1,5,6,4], k =2
 * output: 5
 */

//this approach sorts the input array 'nums' in ascending order using the Arrays.sort method
//then it returns the k-th largest element by accessing the (nums.length - k)th index of the sorted array
//time complexity: O(n log n) because of sorting
//space complexity: O(1) since sorting is done in place

import java.util.Arrays;

class Solution {
  public static int findKthLargest (int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k];
  }

  public static void main(String [] args) {
    int[] nums1 = {3,2,1,5,6,4};
    System.out.println(findKthLargest(nums1, 2));
  }
}

