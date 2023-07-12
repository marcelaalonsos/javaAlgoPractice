/*
 * Given an array of intervals where intervals[i] = [start, end] merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[][] mergeIntervals(int[][] intervals) {
    //initialize an empty vector to store the merged intervals
    List<int[]> answer = new ArrayList<>();
    //sort the intervals based on their start time
    Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
    //if the array is empty, return the answer vector as an array
    if (intervals.length == 0) {
      return answer.toArray(new int[0][]);
    }
    //initialize temporary vector to store the first interval from the sorted input vector
    int[] temp = intervals[0];
    //iterate over the intervals
    for (int i = 0; i < intervals.length; i++){
      //if the start time of the current interval is less than or equal to the end time time of the temp interval
      //update the end time of the temp interval to the max of its current end time and the end time of the current interval
      if (intervals[i][0] <= temp[1]){
        temp[1] = Math.max(temp[1], intervals[i][1]);
      } else {
        //add the temp interval to the answer and update the temp interval to the current interval
        answer.add(temp);
        temp = intervals[i];
      }
    }
    //add the last temp interval to the answer
    answer.add(temp);
    //return the answer
    return answer.toArray(new int[0][]);
  }
}
