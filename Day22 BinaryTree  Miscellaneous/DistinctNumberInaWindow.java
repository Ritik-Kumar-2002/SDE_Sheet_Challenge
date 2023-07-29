import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		ArrayList<Integer> trav = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<k; i++) {
			map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
		}
		trav.add(map.size());
		for(int i=k; i<arr.size(); i++){
			map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
			if( map.get(arr.get(i-k)) == 1) map.remove(arr.get(i-k));
			else map.put(arr.get(i-k), map.get(arr.get(i-k))-1);
			trav.add(map.size());
		}
		return trav;
	}

}
