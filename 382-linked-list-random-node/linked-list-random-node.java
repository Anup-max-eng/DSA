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
    private ListNode head;
    public Solution(ListNode head) {
        this.head=head;
    }
    
    public int getRandom() {
        ListNode curr=head;
        Random rand =new Random();
        int length=0;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        int RandomeNode = rand.nextInt(length);
        curr=head;
        for(int i=0;i<RandomeNode;i++){
          curr=curr.next;
        }
         
   return curr.val; }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */