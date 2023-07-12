/*
 * Given a singly linked list, find the middle of the linked list. If there are even nodes, then there would be two middle nodes. we need to print the second middle element
 */
/*
 * Approach: fast and slow pointers
 * Traverse linked list using two pointers.
 * Move one pointer by one, and the other by two
 * When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list
 */

class LinkedList {
  Node head;
  class Node {
  int value;
  Node next;
  Node (int val) {
    value = val;
    next = null;
  }
}

  public void printMiddle () {
    //make the 2 pointers
    Node slow = head;
    Node fast = head;
    //of the head is not empty
    if (head != null) {
      //while the fast node is not null nor its next value is null
      while (fast != null && fast.next != null) {
        //set the slow to the next, and the fast to 2 next
        slow = slow.next;
        fast = fast.next.next;
      }
      //the middle is the slow.value
      System.out.println(slow.value);
    }
  }
}
