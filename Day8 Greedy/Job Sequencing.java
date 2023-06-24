class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, new Comparator<Job>(){
            public int compare(Job J1, Job J2){
                return J2.profit - J1.profit;
            }
        });
        
        int [] Jobs = new int[n+1];
        int [] ans = new int[2];
        int count =0;
        int profit =0;

        for(Job J: arr){
            int j = J.deadline;
            while(j>0){
                if(Jobs[j] == 0){
                    Jobs[j] = J.id;
                    count++;
                    profit += J.profit;
                    break;
                }
                j--;
            }
            
            // System.out.println(arr[i].id + " "+ arr[i].deadline+" " + arr[i].profit);
        }
        ans[0] = count;
        ans[1] = profit;
        return ans;
        
    
    }
    
}