import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String expression)     {
        // Write your code here.
        Stack<Character> stack  = new Stack<>();
        for(int i=0; i<expression.length(); i++){
            char c= expression.charAt(i);
            if(c == '{' || c=='(' || c=='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(c == '}' && stack.peek() !='{'){
                        return false;
                    }else  if(c == ')' && stack.peek() !='('){
                        return false;
                    }else  if(c == ']' && stack.peek() !='['){
                        return false;
                    }else {
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}