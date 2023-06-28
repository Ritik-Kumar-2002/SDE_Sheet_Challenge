class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(start[i]);
            sublist.add(end[i]);
            adj.add(sublist);
        }
        // System.out.println(adj);
        Collections.sort(adj, new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2){
                return l1.get(1)-l2.get(1);
            }
        });
        // System.out.println(adj);
        int count =1;
        int endtime = adj.get(0).get(1);
        for(int i=1; i<n; i++){
            if(adj.get(i).get(0) > endtime){
                count++;
                endtime = adj.get(i).get(1);
            }
        }
        return count;
    }
}
