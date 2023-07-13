class Solution {
    
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int [] visited = new int[V];
        visited[0] = 1;
        queue.add(0);
        while(!queue.isEmpty()){
            int node = queue.remove();
            ans.add(node);
            for(Integer neigh: adj.get(node)){
                if(visited[neigh] ==0 ) {
                    visited[neigh] = 1;
                    queue.add(neigh);
                }
            }
        }
      
        return ans;
    }
}