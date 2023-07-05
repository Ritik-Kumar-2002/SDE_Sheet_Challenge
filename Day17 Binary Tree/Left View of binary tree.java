//User function Template for Java

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
}*/
class Tree
{
    public void trav(Node root, ArrayList<Integer> leftview, int level ){
        if(root== null) return ;
        if(level == leftview.size()){
            leftview.add(root.data);
        }
        trav(root.left, leftview, level+1);
        trav(root.right, leftview, level+1);
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> leftview = new ArrayList<>();
        trav(root, leftview, 0);
        return leftview;
    }
}