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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode curr = head, prev = null, forward = head.next;
        while(forward != null){
            curr.next = prev;
            prev = curr;
            curr = forward;
            forward = forward.next;
        }
        curr.next= prev;
        return curr;
    }
}