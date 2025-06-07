/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head, second = head, front = head;

        
        for (int i = 1; i < k; i++) {
            front = front.next;
        }
        ListNode kthFromStart = front;

        while (front.next != null) {
            front = front.next;
            second = second.next;
        }
        ListNode kthFromEnd = second;

        int temp = kthFromStart.val;
        kthFromStart.val = kthFromEnd.val;
        kthFromEnd.val = temp;

        return head;
    }
}

