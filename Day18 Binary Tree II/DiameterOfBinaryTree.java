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
    int max=0;
    public int find_dia(TreeNode root){
        if(root == null) return 0;
        int leftheight = find_dia(root.left);
        int rightheight = find_dia(root.right);
        max = Math.max(max, leftheight+rightheight);
        return 1 + Math.max(leftheight, rightheight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        find_dia(root);
        return max;
    }
}