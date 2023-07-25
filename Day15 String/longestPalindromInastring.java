class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];   
        int gap=0,max=0;
        String longest="";
        while(gap<n){
            int i=0, j=gap;
            while(i<n && j<n){
                if(gap == 0) {
                    dp[i][j] = true;
                }else if(gap == 1){
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                    else dp[i][j] = false;
                }else {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] ) dp[i][j] = true;
                    else dp[i][j] = false;
                }
                i++;
                j++;
            }
            gap++;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dp[i][j] ){
                    String substr= s.substring(i,j+1);
                    if(max < substr.length()) {
                        max = substr.length();
                        longest = substr;
                    }
                }
            }
        }
        return longest;
    }
}