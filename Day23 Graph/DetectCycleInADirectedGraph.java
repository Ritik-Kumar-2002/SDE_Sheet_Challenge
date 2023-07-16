
class Solution {
    public boolean fun(int node, int [] vis, int [] pathvisited,ArrayList<ArrayList<Integer>> adj ){
        vis[node] = 1;
        pathvisited[node] = 1;
        
        for(Integer neigh: adj.get(node)){
            if(vis[neigh] == 0){
                if(fun(neigh, vis, pathvisited, adj)) return true;
            }else if(pathvisited[neigh]  == 1) return true;
        }
        pathvisited[node] = 0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int [] vis = new int[V];
        int [] pathVisited = new int[V];
        for(int i=0; i<V; i++){
            if(vis[i] == 0){
                if(fun(i, vis, pathVisited, adj)) return true;
            }
            
        }
        return false;
    }
}