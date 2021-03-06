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
    public ListNode rotateRight(ListNode head, int n) {
        
        if(head == null || head.next == null || n == 0) {
            return head;
        }
        
        ListNode curr = head;
        int len = 1;
        
        while(curr.next != null) {
            len++;
            curr = curr.next;
        }
        
        curr.next = head;
        n = len - n % len;
        
        while(n != 0) {
            curr = curr.next;
            n--;
        }
        
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}