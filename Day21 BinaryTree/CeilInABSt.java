import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {

    public  static int findCeil(TreeNode<Integer> root, 
    int X) {

        TreeNode<Integer> node = root;
        int ans = -1;
        while(node != null){
            if(node.data == X) return X;
            else if(node.data < X){node = node.right; }
            else {
                ans = node.data;
                node = node.left;
            }
        }
        return ans;

    }
}
