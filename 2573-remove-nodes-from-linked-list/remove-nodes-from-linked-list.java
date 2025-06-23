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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode dummy = new ListNode(0);
        ListNode hold = dummy;
        ListNode ite = prev;
        int max = Integer.MIN_VALUE;

        while (ite != null) {
            if (ite.val >= max) {
                hold.next = new ListNode(ite.val);
                hold = hold.next;
                max = ite.val;
            }
            ite = ite.next;
        }

        
        ListNode prev1 = null;
        curr = dummy.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev1;
            prev1 = curr;
            curr = next;
        }

        return prev1;
    }
}
