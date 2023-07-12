/*
 * you are given the heads of two linked lists, lis1 and list2
 * merge the two lists into one sorted list. the list should be amde by splicing together the nodes of the first two lists
 * return the head of the merged linked list
 */


public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val;}
  ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //check if list1 and list2 are not null
    if (list1 != null && list2 != null) {
      //if not, then check if the values of list2 are greater than the values of list1
      if (list1.val < list2.val) {
        //if not, then set the list1.next value to the recursive call of mergeTwoLists with list1.next and list2 as arguments
        list1.next = mergeTwoLists(list1.next, list2);
        //return the head of list1
        return list1;
        //if the vals of list 1 are greater than list 2, then
      } else {
        //set list2.next as the recursive call of mergeTwoLists with list1, and list2.next as arguments
        list2.next = mergeTwoLists(list1, list2.next);
        //return the head of list2
        return list2;
      }
    }
    //check for outliers, if the list 1 is empty, then return list2
    if (list1 == null) {
      return list2;
    } else {
      //else return list1
      return list1;
    }
  }
}
