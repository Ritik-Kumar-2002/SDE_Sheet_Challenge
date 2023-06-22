/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1= headA, curr2 = headB;
        int len = 0, len2=0;
        while(curr1 != null){
            curr1 =curr1.next;
            len++;
        }
        while(curr2 != null){
            curr2 =curr2.next;
            len2++;
        }
        curr1 = headA;
        curr2 = headB;
        while(len > len2){
            curr1 = curr1.next;
            len--;
        }
        while(len2 > len){
            curr2 = curr2.next;
            len2--;
        }
        while( curr1 != null ){
            if(curr1 == curr2) return curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr2;
    }
}