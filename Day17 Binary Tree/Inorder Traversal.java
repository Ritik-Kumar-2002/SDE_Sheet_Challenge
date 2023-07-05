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
    
    public void InOrderTraversal(TreeNode root, List<Integer> pq){
        if(root == null){
            return ;
        }
        InOrderTraversal(root.left, pq);
        pq.add(root.val);
        InOrderTraversal(root.right, pq);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        InOrderTraversal(root, list);
        return list;
    }
}