/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void fun(TreeNode root, ArrayList<Integer> list){
        if(root == null) return ;
      
        list.add(root.val);
        fun(root.left, list);
        fun(root.right, list); 
     
    }
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList<Integer> inorder =new ArrayList<>();
        fun(root, inorder);
        System.out.println( inorder);
        for(Integer elem: inorder){
            if(map.containsKey(k-elem)) return true;
            map.put(elem, 1);
        }
        
        return false;
    }
}