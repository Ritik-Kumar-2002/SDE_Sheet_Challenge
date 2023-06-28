class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0,i=0, j=0, max=0;
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                count++;
                max= Math.max(max, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return max;
        
    }
    
}