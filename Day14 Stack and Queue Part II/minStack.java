class MinStack {
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int x) {
       if(minStack.size() == 0 ) {
           minStack.push(x);
       }else{
           if(minStack.peek() >= x){
               minStack.push(x);
           }
       }
       stack.push(x);
    }
    
    public void pop() {
        // System.out.println("stack peek & min stack peek "+stack.peek() + " "+minStack.peek());
        if(stack.peek().equals(minStack.peek())) minStack.pop();
        stack.pop();
    }
    
    public int top() {
        if(stack.size()==0) return -1;
        return stack.peek();
    }
    
    public int getMin() {
        // System.out.println("min stack "+minStack);
        // System.out.println("stack "+stack);
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */