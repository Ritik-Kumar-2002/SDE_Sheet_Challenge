class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list =new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int s = j+1, end = n-1;
                
                while(s < end){
                    long sum=0;
                    sum = (long)nums[i]+ (long)nums[j]+ (long)nums[s]+ (long)nums[end];
                    if(sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[s]);
                        temp.add(nums[end]);
                        set.add(temp);
                        s++;
                    }else if(sum > target) end--;
                    else s++;
                }
            } 
        }

        for(List<Integer> temp: set) list.add(temp);
        return list;
    }
}