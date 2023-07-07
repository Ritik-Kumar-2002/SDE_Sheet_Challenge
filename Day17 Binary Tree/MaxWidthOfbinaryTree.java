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
    
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        HashMap<TreeNode,Integer> map =new HashMap<>();
        queue.add(root);
        int maxwidth =0, ans=0;
        if(root == null) return 0;
        map.put(root, 0);
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int start=0,end=0;
            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                if(i==0) start = map.get(node);
                if(i==size-1) end = map.get(node);
                if(node.left != null) {
                    map.put(node.left, map.get(node)*2+1);
                    queue.add(node.left);
                }
                if(node.right != null) {
                    map.put(node.right, map.get(node)*2+2);
                    queue.add(node.right);
                }
            }  
            maxwidth = Math.max(maxwidth, end-start+1);
        }
        return maxwidth;
    }
}