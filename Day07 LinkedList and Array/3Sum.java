class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++){
            int j= i + 1;
            int k = nums.length - 1;
            int sum = 0;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp =new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                }else if( sum > 0) k--;
                else j++;
            }
        }

        for(List<Integer> temp : set){
            ans.add(temp);
        }
        return ans;
        
    }
}