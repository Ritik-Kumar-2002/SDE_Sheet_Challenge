import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0; i<kArrays.size(); i++) {
			for(int j=0; j< kArrays.get(i).size(); j++) pq.add(kArrays.get(i).get(j));
		}

		while(pq.size() > 0){
			list.add(pq.poll());
		}
		return list;
	}
}
