import java.util.* ;
import java.io.*; 
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		
		PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<a.size(); i++){
			for(int j=0; j<b.size(); j++){
				pq.add(a.get(i)+b.get(j));
			}
		}
		ArrayList<Integer> temp = new ArrayList<>();
		if(pq.size() < k){
			return temp;
		} 
		// System.out.println("pq "+pq);
		while(k>0){
			temp.add(pq.poll());
			k--;
		}
		return temp;
	}
}