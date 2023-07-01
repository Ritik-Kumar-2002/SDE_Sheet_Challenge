class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        // System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int  compare(Map.Entry<Integer, Integer> mp1, Map.Entry<Integer, Integer> mp2){
                return mp2.getValue()- mp1.getValue();
            }
        });
        // System.out.println(list);
        int i=0;
        int [] ans = new int[k];
        for(Map.Entry<Integer, Integer> entry: list){
            if(i<k) ans[i] = entry.getKey();
            else break;
            i++;
        }
        return ans;
    }
}