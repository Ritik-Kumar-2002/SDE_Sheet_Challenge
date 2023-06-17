class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        if(nums.length == 0) return 0;
        for(Integer elem: nums) map.put(elem, true);
        for(Integer elem: nums){
            if(map.containsKey(elem-1)) {
                map.put(elem, false);
            }
        }
        int max=0;
        for(Integer elem: nums){
            if(map.get(elem) == true){
                int start  = elem;
                int len=1;
                while(map.containsKey(start+1)) {
                    len++;
                    start = start+1;
                }
                max = Math.max(len, max);
            }
           
        }
        return max;

    }
}