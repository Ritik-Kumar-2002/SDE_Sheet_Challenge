class Solution {
    public int LCS(String s1, String s2, int i, int j, int [][] dp){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1 + LCS(s1, s2, i-1, j-1, dp);
        }else{
            return dp[i][j] =  0 + Math.max(LCS(s1, s2, i-1, j, dp), LCS(s1, s2, i, j-1, dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int N = text1.length(), M = text2.length()-1;
        int [][] dp = new int[N+1][M+1];
        for(int i=0; i< dp.length; i++){
            for(int j=0; j< dp[0].length; j++) dp[i][j] = -1;
        }
        return LCS(text1, text2, text1.length()-1, text2.length()-1, dp);

    }
}