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
    public TreeNode fun(int InStart, int InEnd, int PostStart, int PostEnd, int [] inorder, int [] postorder, HashMap<Integer, Integer> map){
        if(InStart > InEnd || PostStart > PostEnd) return null;
        
        TreeNode root =new TreeNode(postorder[PostEnd]);
        int ind= map.get(postorder[PostEnd]);
        int numleft = ind - InStart;

        root.left = fun(InStart, ind-1, PostStart , PostStart + numleft - 1, inorder, postorder, map);
        root.right = fun(ind+1, InEnd, PostStart + numleft, PostEnd-1, inorder, postorder, map);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        int N = inorder.length;
        int M = postorder.length;
        for(int i=0; i< N; i++) map.put(inorder[i], i);
        System.out.println(map);
        return fun(0, N-1, 0, M-1, inorder, postorder, map);
    }
}