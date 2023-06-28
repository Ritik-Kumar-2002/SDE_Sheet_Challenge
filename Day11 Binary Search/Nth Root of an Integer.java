public class Solution {
    public static int NthRoot(int n, int m) {
        long left=1, right = m, mid=0;
        while(left<=right){
            mid = (left+right)/2;
            long product =1;
            
            if((int)Math.pow(mid, n) > m){
                right = mid-1;
            }else if((int)Math.pow(mid, n) < m) left= mid+1;
            else return (int)mid;
        }
        return -1;
    }
}
