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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<Integer> postStack = new Stack<>();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> postorder = new ArrayList<>();
        if(root == null) return postorder;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            postStack.push(node.val);
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
            
            
        } 
        
        while(!postStack.isEmpty()) postorder.add(postStack.pop());
        return postorder;
    }
}