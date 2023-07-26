
public class Solution {
    
    public static int minCharsforPalindrome(String str) {
        int n = str.length();
        int i=0,j=n-1;
        int count=0;
        int temp=j;
        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                count++;
                temp--;
                i=0;
                j = temp;
            }
        }
        return count;
    }

}