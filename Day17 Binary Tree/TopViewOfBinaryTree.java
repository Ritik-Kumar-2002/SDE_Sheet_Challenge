/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Pair{
    int dir;
    Node root;
    public Pair(int dir, Node root ){
        this.dir = dir;
        this.root = root;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> topview = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, root));
        while(!queue.isEmpty()){
            Pair p = queue.remove();
            if(!map.containsKey(p.dir)){
                map.put(p.dir, p.root.data);
            }
            if(p.root.left != null) queue.add(new Pair(p.dir-1, p.root.left));
            if(p.root.right != null) queue.add(new Pair(p.dir+1, p.root.right));
        }
        // inorder_trav(root, map, 0);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        // System.out.println("map "+list);
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> e1,  Map.Entry<Integer,Integer> e2){
                return e1.getKey()-e2.getKey();
            }
        });
        // System.out.println("after sort"+list);
        for(Map.Entry<Integer,Integer> entry: list) topview.add(entry.getValue());
        return topview;
        
    }
}