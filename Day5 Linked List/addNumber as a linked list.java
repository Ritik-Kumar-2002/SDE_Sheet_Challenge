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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head  = new ListNode(-1);
        ListNode curr = head;
        ListNode curr1 = l1, curr2 = l2;
        int carry = 0;
        while(curr1 != null || curr2 != null){
            int sum=carry;
            if(curr1!= null) {
                sum += curr1.val;
                curr1 =curr1.next;
            }
            if(curr2!= null) {
                sum += curr2.val;
                curr2= curr2.next;
            }

            if(sum > 9){
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                carry = 1;
            }else{
                curr.next = new ListNode(sum);
                curr =curr.next;
                carry = 0;
            }
        }
        if(carry == 1) curr.next = new ListNode(carry);
        return head.next;
    }
}