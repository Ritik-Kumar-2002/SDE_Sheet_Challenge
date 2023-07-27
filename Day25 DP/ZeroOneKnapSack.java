class Solution 
{ 
    public static int knap_sack(int ind, int W, int [] wt, int [] val, int [][] dp){
        if(ind == wt.length) return 0;
        
        if(dp[ind][W] != -1) return dp[ind][W];
        int pick =0, notpick=0;
        // I have option to pick or not pick the current guy 
        if(W >= wt[ind]){
            pick = val[ind] + knap_sack(ind+1, W-wt[ind], wt,  val, dp);
        }
            notpick =  0 + knap_sack(ind+1, W, wt, val, dp);
        return dp[ind][W] = Math.max(pick, notpick);
    }
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int [][] dp = new int[n+1][W+1];
         for(int  i=0; i<dp.length; i++){
             for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
         }
         return knap_sack(0, W, wt, val, dp);
    } 
}
