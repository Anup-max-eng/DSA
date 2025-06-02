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
    public int getDecimalValue(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int decimal = 0;
        temp = head;
        int power = length - 1;

        while (temp != null) {
            if (temp.val == 1 || temp.val == 0) {
                decimal += temp.val * Math.pow(2, power);
            } else {
                return -1;
            }
            power--;
            temp = temp.next;
        }

        return decimal;
    }
}
