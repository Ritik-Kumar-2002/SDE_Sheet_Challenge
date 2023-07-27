class Solution {
    public int longestIncreasingSubsequence(int [] nums, int ind, int prev, int [][] dp ){
        if(ind == nums.length) return 0;

        if(dp[ind][prev+1] != -1) return dp[ind][prev+1];
        int NotPick  = 0;
        NotPick = 0 + longestIncreasingSubsequence(nums, ind+1, prev, dp);
        int Pick = 0;
        if(prev == -1 || nums[ind] > nums[prev]) {
            Pick = 1 + longestIncreasingSubsequence(nums, ind + 1, ind, dp);
        }
        return  dp[ind][prev+1] = Math.max(Pick, NotPick);
    }
    public int lengthOfLIS(int[] nums) {
        int [][] dp = new int[nums.length][nums.length+1];
        for(int i=0; i< dp.length; i++){
            for(int j=0; j< dp[0].length; j++) dp[i][j] = -1;
        }
        return longestIncreasingSubsequence(nums, 0, -1, dp);
    }
}