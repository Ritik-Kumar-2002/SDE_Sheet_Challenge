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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> adj = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return adj;
        int level = 0;
        queue.add(root);
        while( !queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while(size > 0){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                size--;
            }
            if(level%2 == 0) adj.add(list);
            else{
                Collections.reverse(list);
                adj.add(list);
            }
            level++;
        }
        return adj;
    }
}