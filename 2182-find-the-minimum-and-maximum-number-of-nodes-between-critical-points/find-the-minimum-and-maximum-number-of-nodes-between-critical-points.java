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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
    ArrayList<Integer> position=new ArrayList<>();
    int index=1;
    ListNode prev=head;
    ListNode curr=head.next;
    while(curr.next!=null){
    if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)){
       position.add(index);
        }
        prev=curr;
        curr=curr.next;
        index++;
        }
        if(position.size()<2){
            return new int[]{-1,-1};
        }
        int mindiff=Integer.MAX_VALUE;
        int maxdiff=Integer.MIN_VALUE;
    for(int i=1;i<position.size();i++){
       mindiff=Math.min(mindiff,position.get(i)-position.get(i-1));
      
    }
     maxdiff=(position.get(position.size()-1)-position.get(0));
    return new int[]{mindiff,maxdiff};}

}