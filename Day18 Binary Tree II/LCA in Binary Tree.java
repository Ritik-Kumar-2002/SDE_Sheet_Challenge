/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode LCS(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode left = LCS(root.left, p, q);
        TreeNode right = LCS(root.right, p, q);
        if(left == null ) return right;
        else if(right == null) return left;
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return LCS(root, p, q);
    }
}