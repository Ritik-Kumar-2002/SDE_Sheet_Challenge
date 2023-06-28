class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    
    public boolean isPoss(int node, int col, ArrayList<ArrayList<Integer>> adj, int [] colors ){
        for(Integer neigh: adj.get(node)){
            if(colors[neigh] == col) return false;
        }
        return true;
    }
    public boolean graph_color(int node, ArrayList<ArrayList<Integer>> adj, int m, int [] colors, int n){
        if(node == n) return true;
        
        for(int col=0; col<m; col++){
            if(isPoss(node, col, adj, colors)){
                colors[node] = col;
                if(graph_color(node+1, adj, m, colors, n)) return true;
                colors[node] = -1;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[0].length; j++){
                if(graph[i][j]){
                    adj.get(i).add(j);
                }
            }
        }
        int [] colors  = new int[n];
        for(int i=0; i<n; i++) colors[i] = -1; // -1 represent no color on ith node
        return graph_color(0, adj, m, colors, n);
        
    }
}