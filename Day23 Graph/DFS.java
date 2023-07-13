
class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, int [] visited, 
    ArrayList<Integer> ans){
        visited[node] = 1;
        ans.add(node);
        for(Integer neigh: adj.get(node)){
            if(visited[neigh] == 0) dfs(neigh, adj, visited, ans);
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans =  new ArrayList<>();
        int [] vis = new int[V];
        dfs(0, adj, vis, ans);
        return ans;
    }
}