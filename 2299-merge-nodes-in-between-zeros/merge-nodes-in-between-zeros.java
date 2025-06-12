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
    public ListNode mergeNodes(ListNode head) {
      ListNode curr=head;
      ListNode zeroFinder =head.next;
      int sum=0;
      ListNode dummy=new ListNode(0);
      ListNode prev =dummy;
      while(curr!=null){
        sum=0;
        while(zeroFinder != null && zeroFinder.val != 0){
            sum+=zeroFinder.val;
            zeroFinder=zeroFinder.next;
        }
        if(sum!=0){
       prev.next = new ListNode(sum);
        prev = prev.next;
        }
       
        curr = zeroFinder;
        if (zeroFinder != null){
                zeroFinder = zeroFinder.next;

         } }
  
  return dummy.next;   }
}