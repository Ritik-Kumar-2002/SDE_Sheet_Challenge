class MedianFinder {

    PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
    PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(MaxHeap.isEmpty() || MaxHeap.peek() > num){
            MaxHeap.add(num);
        }else MinHeap.add(num);

        if(MaxHeap.size() > 1 + MinHeap.size()) MinHeap.add(MaxHeap.poll());
        else if ( MinHeap.size() > 1 + MaxHeap.size() ) MaxHeap.add(MinHeap.poll());
    }
    
    public double findMedian() {

        // System.out.println("Max heap is "+ MaxHeap);
        // System.out.println("min Heap is " + MinHeap);
        if(MaxHeap.size() > MinHeap.size()) return MaxHeap.peek();
        else if(MinHeap.size() > MaxHeap.size() ) return MinHeap.peek();
        else{
            System.out.println("running "+ (MaxHeap.peek() + MinHeap.peek()));
            return (double)(MaxHeap.peek() + MinHeap.peek()) / 2;
        } 
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */