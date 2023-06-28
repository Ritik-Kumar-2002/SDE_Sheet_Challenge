/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	Node temp = root;
    	while(temp != null){
    	    Node curr = temp;
    	    while(curr!= null){
    	         pq.add(curr.data);
    	         curr = curr.bottom;    
    	    }
    	    temp = temp.next;
    	}
    	Node head = new Node(-1);
    	Node curr = head;
    // 	System.out.println("queue"+ pq);
    	while(!pq.isEmpty()){
    	    curr.bottom = new Node(pq.poll());
    	    curr = curr.bottom;
    	}
    	return head.bottom;
    	
    }
}