/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node left;
     public Node right;

     Node()
     {
         this.data = 0;
         this.left = null;
         this.right = null;
     }

     Node(int data)
     {
         this.data = data;
         this.left = null;
         this.right = null;
     }

     Node(int data, Node left, Node right)
     {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 }

 *****************************************************************/
class Pair{
    boolean bool;
    int data;
    Pair(boolean bool, int data){
        this.bool =bool;
        this.data = data;
    }
}
public class Solution {
    public static Pair fun(Node root){
        if(root == null) return new Pair(true, 0);
        if(root.left == null && root.right == null) {
            return new Pair(true, root.data);
        }
        

        Pair left = fun(root.left);
        Pair right = fun(root.right);
        
        if(left.bool == false) return new Pair(false, root.data);
        if(right.bool == false) return new Pair(false, root.data);
        
        if((left.data + right.data) == root.data ) return new Pair(true, root.data);
        
        return new Pair(false, root.data);
    }
    public static boolean isParentSum(Node root) {
       Pair p = fun(root);
       return p.bool;
    }
}