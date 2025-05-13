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
    public ListNode middleNode(ListNode head) {
        ListNode secondNode=head;
        ListNode lastNode=head;
        while(lastNode!= null &&lastNode.next!=null){
            lastNode=lastNode.next.next;
            secondNode=secondNode.next;
        }
        return secondNode;
}}