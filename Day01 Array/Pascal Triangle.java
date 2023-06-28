class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sublist.add(1);
        adj.add(sublist);
        System.out.println(adj);
        for(int i=1; i<numRows; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0; j<adj.get(i-1).size()-1; j++){
                temp.add(adj.get(i-1).get(j)+ adj.get(i-1).get(j+1));
            }
            temp.add(1);
            adj.add(temp);
        }
        return adj;
    }
}