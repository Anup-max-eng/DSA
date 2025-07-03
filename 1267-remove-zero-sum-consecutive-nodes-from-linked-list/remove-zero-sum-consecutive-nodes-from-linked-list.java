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
    public ListNode removeZeroSumSublists(ListNode head) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum == 0) {
                    
                    for (int k = j; k >= i; k--) {
                        arr.remove(k);
                    }
                    i = -1; 
                    break;
                }
            }
        }

        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        for (int val : arr) {
            prev.next = new ListNode(val);
            prev = prev.next;
        }

        return dummy.next;
    }
}
