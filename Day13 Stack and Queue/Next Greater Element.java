import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		int [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        int i=n-1;
        ans[i] = -1;
        i=i-1;
        stack.push(arr[n-1]);
        while(i>=0){
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.size()==0) ans[i] = -1;
            else ans[i] = stack.peek();
            stack.push(arr[i]);
            i--;
        }
		return ans;
	}

}
