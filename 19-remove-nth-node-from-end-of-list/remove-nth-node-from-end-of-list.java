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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Reverse the list
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }

        // Now 'prev' is the head of the reversed list
        ListNode newhead = prev;
        ListNode slow = null;
        int count = 1;

        // Step 2: Traverse and skip the nth node
        while (newhead != null) {
            if (count == n) {
                // Skip the nth node
                newhead = newhead.next;
                count++;
                continue;
            }

            // Build the list again in reverse
            ListNode temp = newhead.next;
            newhead.next = slow;
            slow = newhead;
            newhead = temp;
            count++;
        }

        // Step 3: Return the head of the final list
        return slow;
    }
}
