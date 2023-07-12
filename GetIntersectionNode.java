/*
 * Given the heads of two singlt linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null
 */

public class ListNode {
  int val;
   ListNode next;
   ListNode(int x) {
    val = x;
    next = null;
   }
}

class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA, b = headB;
    while(a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
    return a;
  }
}
