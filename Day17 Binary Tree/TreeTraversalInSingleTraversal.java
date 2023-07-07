/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
import java.util.*;
public class Solution {
    public static void traversal(BinaryTreeNode<Integer> root, 
    List<Integer> inorder, List<Integer> preorder, List<Integer> postorder){
        if(root == null) return;
        preorder.add(root.data);
        traversal(root.left, inorder, preorder, postorder);
        inorder.add(root.data);
        traversal(root.right, inorder, preorder, postorder);
        postorder.add(root.data);
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        
        List<List<Integer>> trav = new ArrayList<>();
        List<Integer> preorder= new ArrayList<>();
        List<Integer> postorder= new ArrayList<>();  
        List<Integer> inorder= new ArrayList<>();   
        
        traversal(root, inorder, preorder, postorder);
        trav.add(inorder);
        trav.add(preorder);
        trav.add(postorder);
        return trav;
    }
}
