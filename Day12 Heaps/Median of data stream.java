
import java.util.*;

public class Solution {

	public static int findMedian(int data, PriorityQueue<Integer> minheap, PriorityQueue<Integer> maxheap) {
			
		if(minheap.size() ==0 && maxheap.size()==0) maxheap.add(data);
		else if(data < maxheap.peek() ) maxheap.add(data);
		else minheap.add(data);
		while(Math.abs(maxheap.size() - minheap.size()) > 1) {
			if(maxheap.size() > minheap.size()) minheap.add(maxheap.poll());
			else maxheap.add(minheap.poll());
		}
		if(maxheap.size() == minheap.size()) return (maxheap.peek()+minheap.peek()) /2;
		else if(maxheap.size() > minheap.size()) return maxheap.peek();
		else return minheap.peek();
	}

	public static void findMedian(int arr[])  {
        int n = arr.length;
		int [] ans =new int[n];
		PriorityQueue<Integer> minheap =new PriorityQueue<>();
		PriorityQueue<Integer> maxheap =new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			int data= arr[i];
			ans[i] = findMedian(data, minheap, maxheap);
		}
		for(int i=0; i<n; i++) System.out.print(ans[i]+" ");

    }


}