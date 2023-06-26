class Solution {
    
    public static void GenerateAllPermutation(int [] input,List<Integer> list, List<List<Integer>> output, int[] marked) {
		if(list.size() == input.length) {
			List<Integer> mid = new ArrayList<>(list);
			output.add(mid);
			return ;
		}
		for(int i=0; i<input.length; i++) {
			if(marked[i]  ==0) {
				list.add(input[i]);
				marked[i]=1;
				GenerateAllPermutation(input, list, output, marked);
				list.remove(list.size()-1);
				marked[i]= 0;
			}
		}
			
	}
    
    public List<List<Integer>> permute(int[] nums) {
        int[] marked= new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			marked[i] =0;
		}
		List<Integer> list= new ArrayList<>();
		List<List<Integer>> output = new ArrayList<>();
		System.out.println("Your all permutation are : ");
		GenerateAllPermutation(nums, list,output, marked);
        
        return output;
    }
}