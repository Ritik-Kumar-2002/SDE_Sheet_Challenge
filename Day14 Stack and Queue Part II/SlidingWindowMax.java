
import java.util.*;
public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
        ArrayList<Integer> sublist = new ArrayList<>(); 
        ArrayList<Integer> output = new ArrayList<>(); 
        for(int i=0; i<k; i++){
            sublist.add(nums.get(i));
        }
        output.add(Collections.max(sublist));
        for(int i=k; i<nums.size(); i++){
            sublist.add(nums.get(i));
            sublist.remove(nums.get(i-k));
           output.add(Collections.max(sublist));
        }
        return output;
	}
}