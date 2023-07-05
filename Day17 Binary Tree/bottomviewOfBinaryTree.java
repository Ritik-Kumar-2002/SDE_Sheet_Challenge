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
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> bottomview = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, root));
        while(!queue.isEmpty()){
            Pair p = queue.remove();
            map.put(p.dir, p.root.data);
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
        for(Map.Entry<Integer,Integer> entry: list) bottomview.add(entry.getValue());
        return bottomview;
    }
}