

//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    ArrayList<Integer> InOrder(Node root){
        ArrayList<Integer> arr= new ArrayList<>();
        if(root.left==null && root.right==null){
            arr.add(root.data);
            return arr;
        }else {
            // Inorder(root.left);
            if(root.left!= null){
                arr.addAll(InOrder(root.left));
            }
            arr.add(root.data);
            if(root.right!=null){
                arr.addAll(InOrder(root.right));
                
            }
            return arr;
        }
        
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        // System.out.println(InOrder(root));
        ArrayList<Integer> arr;
        arr= InOrder(root);
        return arr.get(arr.size()-K);
    }
}