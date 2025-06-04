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
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<Integer> reordered = new LinkedList<>();

    public void reorderList(ListNode head) {
        // Step 1: Copy node values into list
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        // Step 2: Use recursion to reorder into new list
        recur(0, list.size() - 1);

        // Step 3: Write back reordered values to linked list nodes
        curr = head;
        int idx = 0;
        while (curr != null && idx < reordered.size()) {
            curr.val = reordered.get(idx++);
            curr = curr.next;
        }
    }

    private void recur(int i, int n) {
        if (i > n) return;

        if (i == n) {
        
            reordered.add(list.get(i));
            return;
        }

        reordered.add(list.get(i));
        reordered.add(list.get(n));

        recur(i + 1, n - 1);
    }
}
