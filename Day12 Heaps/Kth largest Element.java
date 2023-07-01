class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int element= 0;
        while(k>0){
            element= pq.poll();
            k--;
        }
        return element;
    }
}