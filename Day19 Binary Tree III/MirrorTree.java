// User function Template for Java

// function Template for Java

// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    public Node fun(Node root){
        if(root == null) return null;
        Node left = fun(root.left);
        Node right = fun(root.right);
        
        root.right = left;
        root.left = right;
        return root;
    }
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
       fun(node);
    }
}