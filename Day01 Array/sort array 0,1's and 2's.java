class Solution {
    public void sortColors(int[] nums) {
        int start=0, curr= 0, end = nums.length-1;
        while(curr<=end){
            if(nums[curr] == 1) curr++;
            else if(nums[curr] == 0){
                // swap curr position and starting position value 
                int temp = nums[curr];
                nums[curr] = nums[start];
                nums[start] = temp;
                curr++;
                start++;
            }else if(nums[curr] == 2){
                // swap curr position and end position value 
                int temp = nums[curr];
                nums[curr] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        return ;
    }
}