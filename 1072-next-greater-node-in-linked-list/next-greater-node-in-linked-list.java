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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode hold = head;
        
        while (hold != null) {
            ListNode curr = hold.next;
            boolean found = false;
            
            while (curr != null) {
                if (curr.val > hold.val) {
                    result.add(curr.val);
                    found = true;
                    break;
                }
                curr = curr.next;
            }
            
            if (!found) {
                result.add(0);
            }
            
            hold = hold.next;
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
