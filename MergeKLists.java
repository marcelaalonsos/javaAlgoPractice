/*
 * You are given an array of k linked lists, each list is sorted in ascending order
 * merge all lists into one sorted linked list and return it
 */

public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) {this.val = val;}
  ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    if(l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }

  public ListNode mergeKLists(ListNode[] lists) {
    ListNode answer = null;
    for (int i = 0; i < lists.length; i++) {
      answer = mergeTwoLists(answer, lists[i]);
    }
    return answer;
  }
}
