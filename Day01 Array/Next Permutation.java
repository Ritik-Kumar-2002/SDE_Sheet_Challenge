import java.util.*;
public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int ind=-1;
        int n = permutation.size();
        for(int i=n-2; i>=0; i--){
            if(permutation.get(i) < permutation.get(i+1)) {
                ind = i;
                break;
            }
        }
        // System.out.println("ind "+ind);
        if(ind == -1) {
            Collections.reverse(permutation);
            return permutation;
        }
        for(int i=n-1; i>=0; i--){
            if(permutation.get(i) > permutation.get(ind)){
                int elem= permutation.get(i);
                permutation.set(i, permutation.get(ind));
                permutation.set(ind, elem);
                break;
            }
        }
        int i=ind+1, j= n-1;
        while(i<j){
            int elem= permutation.get(i);
            permutation.set(i, permutation.get(j));
            permutation.set(j, elem);
            i++;
            j--;
        }
        return permutation;
	}
}
