import java.util.* ;

import java.io.*;

 

public class Solution {

 

// minHeap function which take size of Queries and Queries as Input.

// Returns an array out outputs depending on the query.

ArrayList<Integer> heap=new ArrayList<>();

 

public void insert(int n)

{

//insert element at end

 

heap.add(n);

int childindex=heap.size()-1;

int parentindex=(childindex -1 )/2 ;

 

while(childindex > 0)

{

if(heap.get(childindex) < heap.get(parentindex))

{

int tmp=heap.get(childindex);

heap.set(childindex,heap.get(parentindex));

heap.set(parentindex,tmp);

childindex=parentindex;

parentindex=(childindex-1)/2;

}

else

return;

}

 

}

 

public int removeMin()

{

if(heap.size()==0)

return -1;

 

int min=heap.get(0);

heap.set(0,heap.get(heap.size()-1));

heap.remove(heap.get(heap.size()-1));

 

if(heap.size() <=1)

return min;

 

int parentindex=0;

int child1=parentindex * 2 + 1; //left child

int child2=parentindex * 2 + 2; //right child

 

while(child1<heap.size()) //atleat 1 child exists

{

int minindex=parentindex;

if(heap.get(child1) < heap.get(minindex)) //finding min amongst parent child1 and child2

{

minindex=child1;

}

if(child2 < heap.size() && (heap.get(child2) < heap.get(minindex))) //finding mid amongst parent child1 and child2

{

minindex=child2;

}

if(minindex==parentindex) //all elements below are greater.

return min;

int tmp=heap.get(parentindex);

heap.set(parentindex,heap.get(minindex));

heap.set(minindex,tmp);

 

parentindex=minindex;

child1=parentindex * 2 +1;

child2=parentindex * 2 + 2;

}

return min;

 

}

 

 

static int[] minHeap(int n, int[][] q) {

// Write your code here.

 

int count=0;

 

for(int i=0;i<q.length;i++)

{

if(q[i][0]==1)

count+=1;

}

 

int res[]=new int[count];

 

int i=0;

 

Solution obj=new Solution();

 

for(int a[]:q)

{

if(a[0]==0)

{

obj.insert(a[1]);

}

else

{

res[i]=obj.removeMin();

i+=1;

}

}

return res;

}

}