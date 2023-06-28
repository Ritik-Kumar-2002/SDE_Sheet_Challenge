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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode forward = head, curr = null;
        if(head == null) return head;
        int len=0;
        while(forward != null){
            len++;
            forward  = forward.next;
        }
        int steps = len-n;
        if(steps== 0) return head.next;

        int i=0;
        curr= head;
        forward = head;
        while(steps>0){
            curr = forward;
            forward = forward.next;
            steps--;
        }
        curr.next = forward.next;
        return head;
    }
}