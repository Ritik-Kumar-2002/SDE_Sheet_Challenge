class Solution
{
    
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indeg = new int[V];
        Queue<Integer> queue =new LinkedList<>();
        for(int i=0; i<V; i++){
            for(Integer ch: adj.get(i)) indeg[ch]++;
        }
        for(int i=0; i<V; i++) if(indeg[i] == 0) queue.add(i);
        int [] toposort = new int[V];
        int ind=0;
        while(!queue.isEmpty()){
            int node= queue.remove();
            toposort[ind] = node;
            ind++;
            for(Integer elem: adj.get(node)) {
                indeg[elem]--;
                if(indeg[elem] == 0) queue.add(elem);
            }
            
        }
        return toposort;
    }
}