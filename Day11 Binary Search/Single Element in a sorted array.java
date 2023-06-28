class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length, mid = 0, n= nums.length;
        if(nums.length==1) return nums[0];
        if(nums[0] != nums[1] ) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        while(low<=high){
            mid = (low+high)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    low =mid+1;
                }else high = mid-1;
            }else{
                if(nums[mid] == nums[mid-1]) low =mid+1;
                else high = mid-1;
            }
        }
        return nums[low];
    }
}