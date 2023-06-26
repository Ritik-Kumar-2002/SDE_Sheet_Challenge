class Solution {
    
    public void CombinationSum (int[] arr, int target, int i, 
        List<List<Integer>> ans, List<Integer> list ){
       
        if(i == arr.length){ 
            return ;
        } 
        if(target == 0) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            if(temp.size() > 0 && !ans.contains(temp)) ans.add(temp);
        }
        if(target >= arr[i]){
            list.add(arr[i]);
            CombinationSum(arr, target - arr[i], i, ans, list);
            list.remove(list.size()-1);
        } 
            CombinationSum(arr, target, i+1, ans, list);
    } 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        CombinationSum(candidates, target, 0, ans, temp);
        return ans;
    }
}