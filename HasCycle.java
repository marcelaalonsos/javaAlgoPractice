/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it
 */

class ListNode {
  int val;
  ListNode next;
  ListNode (int x) {
    val = x;
    next = null;
  }
}

class Solution {
  public boolean hasCycle(ListNode head) {
    //create 2 pointers, one fast, one slow, set to the head
    ListNode slow = head;
    ListNode fast = head;
    //while the fast is not null and the next value is not null
    while(fast != null && fast.next != null) {
      //set the slow to the next and fast to 2 ahead
      slow = slow.next;
      fast = fast.next.next;
      //if there is a loop, the 2 pointers will meet at some point, if that happens, return true
      if (fast == slow) {
        return true;
      }
    }
    //if the fast.next reaches null and the the pointers never meet, then return false
    return false;
  }
}
