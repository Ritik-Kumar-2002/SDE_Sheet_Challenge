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
    public TreeNode CreateTree(int[] preorder, int preStart, int preEnd,
                              int[] inorder, int inorderStart, int inorderEnd
                              , HashMap<Integer, Integer> hm){
        
        if(preStart > preEnd || inorderStart > inorderEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int inRoot= hm.get(root.val);
        int numLeft = inRoot - inorderStart;
        
        root.left= CreateTree(preorder, preStart + 1, preStart+ numLeft, inorder, inorderStart, inRoot -1 , hm);
        
        root.right = CreateTree(preorder, preStart + numLeft + 1, preEnd, inorder, inRoot+1, inorderEnd, hm);
        
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            hm.put(inorder[i], i);
        }
        TreeNode root = CreateTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length -1, hm);
        return root;
    }
}