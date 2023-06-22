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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        ListNode newhead= new ListNode(-1);
        ListNode curr = newhead;
        while(temp != null){
            if(stack.size()<k){
                stack.push(temp.val);
                temp = temp.next;
            }else{
                while(!stack.isEmpty()){
                    curr.next = new ListNode(stack.pop());
                    curr= curr.next;
                }
            }
        }
        if(stack.size() == k){
            while(!stack.isEmpty()){
                curr.next = new ListNode(stack.pop());
                curr = curr.next;
            }
            return newhead.next;
        } 
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        for(int i=list.size()-1; i>=0; i--){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return newhead.next;
    }
}