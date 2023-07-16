
class Solution
{
    public static void fun(int node, int [] vis, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj){
        
        vis[node] = 1;
        for(Integer neigh: adj.get(node)){
            
            if(vis[neigh] == 0) fun(neigh, vis, stack, adj);
        
        }
        stack.push(node);
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> stack = new Stack<>();
        int [] toposort =new int[V];
        int [] vis = new int[V];
        for(int i=0; i<V; i++){
            if(vis[i] == 0){
                fun(i, vis, stack, adj);
            }
        }
        int i=0;
        while(!stack.isEmpty()) {
            toposort[i] = stack.pop();
            i++;
        }
        return toposort;
    }
}
