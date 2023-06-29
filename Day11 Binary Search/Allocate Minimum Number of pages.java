import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean allocation_possible(long bound, int [] time, int days){
        long n = time.length,pages=0, allocatedday=1;
        for(int i=0; i<n; i++){
            if(time[i] > bound) return false;
            if(pages+time[i] > bound){
                allocatedday += 1;
                pages = time[i];
            }else{
                
                pages += time[i];
            }
        }
        if(allocatedday > days) return false;
        return true;
    }
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        long low =0, high=0,mid=0;
        for(int i=0; i<m; i++){
            high += time[i];
        }
        long ans =-1;
        while(low<=high){
            mid = (low+high)/2;
            if(allocation_possible(mid, time, n)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}