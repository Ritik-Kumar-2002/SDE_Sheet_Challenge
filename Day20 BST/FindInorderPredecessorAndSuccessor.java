public static void inorder(Node root, ArrayList<Integer> list ){
    if(root == null) return ;
    inorder(root.left, list);
    list.add(root.data);
    inorder(root.right, list);
}
//Function to check whether a Binary Tree is BST or not.
public static void findPreSuc(Node root, int key)
{
    int predecessor=-1, successor=-1;
    ArrayList<Integer> list =new ArrayList<>();
    inorder(root, list);
    for(int i=0; i< list.size(); i++){
        if(list.get(i) > key){
            successor = list.get(i);
            break;
        }
        if(list.get(i) < key){
            predecessor = list.get(i);
        }
    }
    pre = new Node(predecessor);
    suc = new Node(successor);
}