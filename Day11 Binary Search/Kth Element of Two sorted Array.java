class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        long ans=-1;
        int i=0, j=0;
        while(k>0 && i<n && j<m){
            if(arr1[i] < arr2[j]){
                ans = arr1[i];
                i++;
            }else {
                    ans = arr2[j];
                    j++;
            }
            k--;
        }
        while(k>0 && i<n){
            ans = arr1[i];
            i++;
            k--;
        }
        while(k>0 && j<m){
            ans = arr2[j];
            j++;
            k--;
        }
        return ans;
        
    }
}