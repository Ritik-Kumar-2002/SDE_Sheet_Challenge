// TIME COMPLEXTIY O(N) SPACE COMPLEXITY O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int count=0, elem = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == elem){
                elem = nums[i];
                count++;
            }else{
                if(count>0) count--;
                else {
                    elem = nums[i];
                    count=1;
                }
            } 
            if(count== 0) {
                elem =-1;
            }
            // System.out.println("elem and count "+ elem+" "+count);
        }
        return elem;
    }
}