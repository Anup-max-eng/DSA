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
    public void reorderList(ListNode head) {
        if (head == null) return;

        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        // Step 1: Copy node values into ArrayList for O(1) access
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int i = 0, j = list.size() - 1;
        curr = head;

        // Step 2: Reorder by alternating values from front and back
        while (i <= j) {
            if (i == j) {
                // When i == j, only one element remains
                curr.val = list.get(i);
                curr = curr.next;
                break;
            }
            curr.val = list.get(i++);
            curr = curr.next;

            curr.val = list.get(j--);
            curr = curr.next;
        }
    }
}

