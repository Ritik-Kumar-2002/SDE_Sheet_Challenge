import java.util.*;


public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int n = matrix.size();
		int m = matrix.get(0).size();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				list.add(matrix.get(i).get(j));
			}
		}
		Collections.sort(list);
		return list.get(list.size()/2);
	}
}