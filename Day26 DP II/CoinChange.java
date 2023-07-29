class Solution {
    public int fun(int ind, int [] coins, int amount, int [][] dp){
        if(ind == 0) {
            if(amount % coins[0] == 0) return amount/coins[0];
            else return (int)1e9;
        }
        if(dp[ind][amount] != -1) return dp[ind][amount];
        int take= (int)1e9 ;
        int nottake = 0 + fun(ind-1, coins, amount, dp);
        if(amount >= coins[ind]){
            take  = 1 + fun(ind, coins, amount-coins[ind], dp);
        }

        
            return dp[ind][amount] =  Math.min(take, nottake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int [][] dp =new int[n][amount+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }
        int c =  fun(n-1, coins, amount, dp);
        if(c == (int)1e9) return -1;
        return c;
    }
}