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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode prev1=dummy1;
        ListNode dummy2=new ListNode(0);
        ListNode prev2=dummy2;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                prev1.next=new ListNode(curr.val);
                prev1=prev1.next;
            }
            else{
                 prev2.next=new ListNode(curr.val);
                prev2=prev2.next;
            }
            curr=curr.next;
        }

         prev1.next = dummy2.next;

        
        return dummy1.next;

    }
}