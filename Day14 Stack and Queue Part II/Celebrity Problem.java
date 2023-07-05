class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) stack.push(i);
        while(stack.size() > 1){
            int f = stack.pop();
            int s = stack.pop();
            if(M[f][s] == 1) { // mean f s ko jaanta hai toh f celebrity nhi ho skta 
                stack.push(s);
            }else stack.push(f); // agar false hai toh f s ko nhi jaanta toh s celebrity nhi ho skta
        }
        int top = stack.peek();
        // System.out.println("top "+top);
        for(int i=0; i<n; i++) {
            if(M[top][i] != 0) return -1;
        }
        for(int i=0; i<n; i++) {
            if(i != top && M[i][top] != 1) return -1;
        }
        return top;
    }
}