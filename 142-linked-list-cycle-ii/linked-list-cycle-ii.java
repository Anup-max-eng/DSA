/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            System.out.println("no cycle");
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

             
                int index = 0;
                ListNode temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    index++;
                }

                System.out.println("tail connects to node index " + index);
                return slow;
            }
        }

        System.out.println("no cycle");
        return null;
    }
}
