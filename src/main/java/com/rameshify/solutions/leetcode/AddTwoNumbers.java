package com.rameshify.solutions.leetcode;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    int carry = 0;
    ListNode tail = head;
    // While l1 or l2 not exhausted or carry is > 0
    while (l1 != null || l2 != null || carry == 1) {
      int sum = (carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val));
      carry = sum / 10;
      tail.next = new ListNode(sum % 10);
      tail = tail.next;
      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }
    return head.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(9);
    l1.next.next = new ListNode(9);
    l1.next.next.next = new ListNode(9);
    l1.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);

    ListNode l2 = new ListNode(9);
//    l2.next = new ListNode(6);
//    l2.next.next = new ListNode(4);
    ListNode x = new AddTwoNumbers().addTwoNumbers(l1, l2);
    while (x != null) {
      System.out.print(x.val + " -> ");
      x = x.next;
    }
    System.out.println(x);
  }

  private static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
