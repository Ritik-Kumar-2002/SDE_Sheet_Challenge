class KthLargest {
    ArrayList<Integer> list = new ArrayList<>();
    int K = 0;
    public KthLargest(int k, int[] nums) {
        for(Integer elem: nums) list.add(elem);
        K= k;
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size()-K);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */