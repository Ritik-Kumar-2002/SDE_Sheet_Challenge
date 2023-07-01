import java.util.*;

public class Solution {

    public static void InsertAtPosition(Stack<Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return ;
        }
        if(stack.peek() > element){
            int pop= stack.pop();
            InsertAtPosition(stack, element);
            stack.push(pop);
        }else{
            stack.push(element);
        }
    }
    public static void SortAStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return ;
        }
        int element= stack.pop();
        SortAStack(stack);
        InsertAtPosition(stack, element);
    }
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        
        SortAStack(stack);
        return ;
	}

}