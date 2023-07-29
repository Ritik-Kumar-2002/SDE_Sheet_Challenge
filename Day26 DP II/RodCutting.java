class Solution {
    public int fun(ArrayList<Integer> cost, int i, int j, int [][] dp){
        if(i>j) return 0;
        int min =(int)1e9;
        if(dp[i][j] != -1) return dp[i][j];
        for(int ind = i; ind<=j; ind++){
            int c = cost.get(j+1)-cost.get(i-1) + fun(cost, i, ind-1, dp) + fun(cost, ind+1, j, dp);  
            min = Math.min(min, c);
        }
        
        return dp[i][j] = min;
    }
    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        Arrays.sort(cuts);
        for(Integer elem: cuts) list.add(elem);
        list.add(n);
        // System.out.println(list);
        int size = list.size();
        int [][] dp = new int[size+1][size+1];
        for(int i=0;i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }
        return fun(list, 1, cuts.length, dp);
    }
}