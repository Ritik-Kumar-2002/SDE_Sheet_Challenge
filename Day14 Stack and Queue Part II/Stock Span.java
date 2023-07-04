class StockSpanner {

    Stack<int []> stack =new  Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=1;
        while(!stack.isEmpty() && stack.peek()[0] <= price ){
            count += stack.pop()[1];
        }
        int [] ar = new int[2];
        ar[0] = price;
        ar[1] = count;
        stack.push(ar);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */