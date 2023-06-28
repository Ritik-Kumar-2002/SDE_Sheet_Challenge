class Solution {

    public void fun(int[] candidates, int target, int ind, HashSet<List<Integer>> set, List<Integer> list ){
        if(target == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            set.add(temp);
            return ;
        } 
        
        if(target < 0) return ;
        for(int i=ind; i<candidates.length; i++){
            if(i!= ind && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            list.add(candidates[i]);
            fun(candidates, target-candidates[i], i+1,set, list );
            list.remove(list.size()-1);
        }
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        fun(candidates, target, 0, set, list);
        for( List<Integer> currlist : set) output.add(currlist);
        return output;
    }
}