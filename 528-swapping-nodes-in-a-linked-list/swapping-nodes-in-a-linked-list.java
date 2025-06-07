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
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        int n = arr.size();
        int i = k - 1;
        int j = n - k;
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);

       
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int val : arr) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummy.next;
    }
}
