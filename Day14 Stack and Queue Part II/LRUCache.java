class LRUCache {
    class Node{
        int key;
        int val;
        Node prev=null;
        Node next= null;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    int size = 0;
    Node tail =new Node(-1, -1);
    Node head =new Node(-1, -1);
    
    HashMap<Integer,Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        size = capacity;
        tail.prev = head;
        head.next =tail;
    }
    private void add(Node newnode){
        Node temp = head.next;

        newnode.next = temp;
        newnode.prev = head;

        head.next = newnode;
        temp.prev = newnode;
    }
    private void delete(Node delnode){
        Node prevv = delnode.prev;
        Node nextt = delnode.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }
    public int get(int key) {
       if(map.containsKey(key)){
           Node node = map.get(key);
           int ans = node.val;
           map.remove(key);
           delete(node);
           add(node);

           map.put(key, node);
           return ans;
       }
       return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node curr =  map.remove(key);
            delete(curr);
        }
        if(map.size() == size){
            map.remove(tail.prev.key);
            delete(tail.prev);
        }
        add(new Node(key, value));
        map.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */