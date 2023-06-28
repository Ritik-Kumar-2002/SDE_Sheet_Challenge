class Solution {
    public void gen_subset(int ind, int [] nums, HashSet<List<Integer>> set, 
    List<Integer> list){
        if(ind == nums.length){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            set.add(temp);
            return;
        }
        gen_subset(ind+1, nums, set, list);
        list.add(nums[ind]);
        gen_subset(ind+1, nums, set, list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set= new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        gen_subset(0, nums, set, temp);
        for(List<Integer> l: set) ans.add(l);
        return ans;
    }

}