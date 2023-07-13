class Solution {
    public boolean DFS( int Node, ArrayList<ArrayList<Integer>> list,  int parent, boolean [] visited){
        visited[Node] = true;
        
        // WORK ONLY FOR A GRAPH IN A SINGLE COMPONENT
        for(Integer element :list.get(Node) ){
            if(!visited[element]){
                if(DFS(element, list, Node, visited) == true){ return true; }
            }else{
                if(parent != element){
                    return true;
                }
            }
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean [] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){
                if(DFS(i, adj, -1, visited)){ return true; }
            }
            
        }
        return false;
    }
}