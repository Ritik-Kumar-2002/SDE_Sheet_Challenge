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
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        
        while(curr != null){
            len++;
            curr = curr.next;
        }
        int length = len;
        if(k == 0 || length == 0) return head;
        int Kind = k%len;
        len = len-Kind;
        if(len == length) return head;
        int i=0;  
        curr = head;      
        while(i<len-1){
            curr= curr.next;
            i++;
        }
        ListNode temp= curr;
        System.out.println("curr.data "+curr.val);
        while(temp.next != null){
            temp = temp.next;
        }
        ListNode ans = curr.next;
        System.out.println("temp.data "+temp.val);
        temp.next= head;
        curr.next = null;
        
       
        return ans;
    }
}