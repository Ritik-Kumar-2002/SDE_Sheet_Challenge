import java.util.* ;
import java.io.*; 
public class Solution {

    public static long merge(long [] arr, int low, int mid, int high){
        int left=low, right=mid+1;
        ArrayList<Long> temp = new ArrayList<>();
        long cnt=0;
        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                cnt += (mid-left+1);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        // System.out.println("temp "+temp);
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        return cnt;
    }
    public static long merge_sort(long [] arr, int low, int high){
        long cnt=0;
        if(low >= high) return cnt;
        int mid = (low+high)/2;
        
        cnt += merge_sort(arr, low, mid);
        cnt += merge_sort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return  cnt;
    }

    public static long getInversions(long arr[], int n) {
    
        long count= merge_sort(arr,0, n-1);
        return count;
    }
}