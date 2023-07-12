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
import java.util.*;
class Solution {
    
    public TreeNode GenerateTree(int [] preOrder,int preStart, int preEnd, int [] inOrder, int inOrderStart, int inOrderEnd, HashMap<Integer, Integer> hm){
        if(preStart > preEnd || inOrderStart > inOrderEnd){ return null; }
        TreeNode root = new TreeNode(preOrder[preStart]);
        // System.out.println(root.val);
        int inRoot = hm.get(root.val);
        // int inRoot = 0;
        int NumLeft = inRoot - inOrderStart;
        root.left = GenerateTree(preOrder, preStart+1, preStart+NumLeft, inOrder, inOrderStart, inRoot-1, hm);
        root.right = GenerateTree(preOrder, preStart+1+NumLeft, preEnd, inOrder, inRoot + 1, inOrderEnd, hm);
        return root;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        int [] inOrder = new int[preorder.length];
        for(int i=0; i<preorder.length; i++){
            inOrder[i] = preorder[i];
        }
        Arrays.sort(inOrder);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<inOrder.length ; i++){
            hm.put(inOrder[i], i);
        }
        TreeNode root = GenerateTree(preorder,0, preorder.length-1, inOrder, 0, inOrder.length-1, hm);
        return root;
    }
}