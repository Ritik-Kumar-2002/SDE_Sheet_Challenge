import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static void trav(TreeNode root, int x, ArrayList<Integer> temp,
    ArrayList<Integer> path ){
        if(root== null) return ;

        if(root.data == x){
            temp.add(root.data);
            path.addAll(temp);
            return ;
        }
        temp.add(root.data);
        trav(root.left, x, temp, path);
        // temp.remove(temp.size()-1);
        

        // temp.add(root.data);
        trav(root.right, x, temp, path);
        temp.remove(temp.size()-1);
    }
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        ArrayList<Integer> temp =new ArrayList<>();
        ArrayList<Integer> path =new ArrayList<>();
        trav(root, x, temp, path);
        return path;
    }
}