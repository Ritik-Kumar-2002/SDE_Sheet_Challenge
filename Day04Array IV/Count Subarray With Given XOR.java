import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int k) {
		int count=0, n = arr.size();
		int xor = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i=0; i<n; i++){
			xor = xor ^ arr.get(i);
			if(map.containsKey(xor^k)) count += map.get(xor ^ k);
			map.put(xor,map.getOrDefault(xor, 0)+1);
		}
		return count;
	}
}