package org.interview;

/* Given a linked list A, swap every two adjacent nodes and return its head.
NOTE: Your algorithm should use only constant space. You may not modify the values in the list;
only nodes themselves can be changed.*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Main {
    public ListNode swapPairs(ListNode A) {
        ListNode dummy=new ListNode(0);
        dummy.next=A;

        ListNode current=dummy;

        while(current.next != null && current.next.next!=null){
            ListNode first=current.next;
            ListNode second= current.next.next;

            first.next=second.next;
            second.next=first;
            current.next=second;

            current=first;
        }
        return dummy.next;

    }
}
