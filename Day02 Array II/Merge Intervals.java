class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int [] >(){
            public int compare(int [] a1, int [] a2){
                return a1[0]-a2[0];
            }
        });
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int s= intervals[0][0];
        int e= intervals[0][1];
        for(int i=1;i<n; i++){
            if(intervals[i][0] > e){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(s);
                arr.add(e);
                list.add(arr);
                s =intervals[i][0];
                e =intervals[i][1];
            }else {
                s= Math.min(intervals[i][0], s);
                e= Math.max(intervals[i][1], e);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(s);
        arr.add(e);
        list.add(arr);
        System.out.println(list);
        int [][] ans= new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}