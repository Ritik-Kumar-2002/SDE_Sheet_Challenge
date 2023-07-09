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
    public int findHeight(TreeNode root){
        if(root == null) return 0;
        int left = findHeight(root.left);
        int right  = findHeight(root.right);
        return left+right+1;
    }
    public boolean fun(TreeNode root){
        if(root == null) return true;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        if(Math.abs(leftHeight-rightHeight) > 1){
            return false;
        } 
        else return fun(root.left) && fun(root.right);
    }
    public boolean isBalanced(TreeNode root) {
        return fun(root);
    }
}