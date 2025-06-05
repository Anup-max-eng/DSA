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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode reversed = null;
        ListNode current = head;

        while (current != null) {
            ListNode newNode = new ListNode(current.val); 
            newNode.next = reversed; 
            reversed = newNode;
            current = current.next;
        }

        ListNode original = head;
        ListNode copy = reversed;

        while (copy != null) {
            if (original.val != copy.val) return false;
            original = original.next;
            copy = copy.next;
        }

        return true;
    }
}


