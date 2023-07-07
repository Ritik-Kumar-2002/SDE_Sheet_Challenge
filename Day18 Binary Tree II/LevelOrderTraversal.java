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
    public static List<List<Integer>> Min_BST_Traversal(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode DeletedRoot = queue.remove();
                sublist.add(DeletedRoot.val);
                if(DeletedRoot.left != null){
                    queue.add(DeletedRoot.left);
                }
                if(DeletedRoot.right != null){
                    queue.add(DeletedRoot.right);
                }   
            }
            list.add(sublist);        
        }
        return list;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        // System.out.println("list is "+Min_BST_Traversal(root));
        if(root == null ){
            return list;
        }
        return Min_BST_Traversal(root);
    }
}