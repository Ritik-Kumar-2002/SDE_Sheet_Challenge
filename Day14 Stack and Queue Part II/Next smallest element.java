import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<n; i++) ans.add(-1);
        Stack<Integer> stack = new Stack<>();
        int i=n-1;
        i=i-1;
        stack.push(arr.get(n-1));
        while(i>=0){
            while(!stack.isEmpty() && arr.get(i) <= stack.peek()){
                stack.pop();
            }
            if(stack.size()>0) ans.set(i, stack.peek());
            stack.push(arr.get(i));
            i--;
        }
        return ans;
    }
}