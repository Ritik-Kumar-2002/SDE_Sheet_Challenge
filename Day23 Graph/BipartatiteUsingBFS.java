
class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> queue =new LinkedList<>();
        queue.add(0); // node 0 and color 0
        int N = graph.length;
        int [] vis = new int[N];
        int [] color = new int[N];
        for(int i=0; i<N; i++) color[i] = -1;
        
        for(int ind=0; ind< N; ind++){
            if(vis[ind] == 0){
                queue.add(ind);
                vis[ind] = 1;
                color[ind] =0;

                while(!queue.isEmpty()){
                    int node = queue.remove();
                    for(int i=0; i<graph[node].length; i++){
                        int neigh = graph[node][i];
                        if(vis[neigh] == 0){
                            queue.add(neigh);
                            vis[neigh] = 1;
                            color[neigh] = 1-color[node];
                        }else if(color[neigh] == color[node] ) return false;
                    }
                }
            }
        }
        
        return true;
    }
}