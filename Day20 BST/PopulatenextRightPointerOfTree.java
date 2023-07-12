/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // first we have to do a level order Traversal of the given tree
        Queue<Node> queue = new LinkedList<>();
        
        if(root== null) return null;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Node> list = new ArrayList<>();
            while(size>0){
                Node node = queue.remove();
                list.add(node);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

                size--;
            }
            for(int i=list.size()-2; i>=0; i--) {
                list.get(i).next = list.get(i+1);
            }
        }
        return root;
    }
}