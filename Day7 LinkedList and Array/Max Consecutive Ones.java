class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int max= 0, count=0, n = nums.length;
        while(i<n){
            while(i<n && nums[i] == 1) {
                count++;
                i++;
            }
            max = Math.max(max, count);
            count=0;
            while(i<n && nums[i] == 0) i++;
        }
        return max;
    }
}