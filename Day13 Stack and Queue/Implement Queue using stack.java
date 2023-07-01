import java.util.*;
public class Queue {
    // Define the data members(if any) here.
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    Queue() {
        // Initialize your data structure here.
    }

    void enQueue(int val) {
        s1.push(val);
    }

    int deQueue() {
        if(s1.size() == 0) return -1;
        while(!s1.isEmpty()) s2.push(s1.pop());
        int pop = s2.pop();
        while(!s2.isEmpty()) s1.push(s2.pop());
        return pop;
    }

    int peek() {
        if(s1.size() ==0) return -1;
        if(s1.size() == 0) return -1;
        while(!s1.isEmpty()) s2.push(s1.pop());
        int peek = s2.peek();
        while(!s2.isEmpty()) s1.push(s2.pop());
        return peek;
    }

    boolean isEmpty() {
        if(s1.size() == 0) return true;
        return false;
    }
}