class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list =new ArrayList<>();
        int len = nums.length;
        for(int i=0; i<nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]) > len/3)  {
                list.add(nums[i]);
                map.remove(nums[i]);
            }
        }
        return list;
    }
}