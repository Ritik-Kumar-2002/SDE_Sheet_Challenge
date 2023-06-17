class GfG
{
    int maxLen(int arr[], int n)
    {
        int maxlen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                maxlen = Math.max(maxlen, i-map.get(sum));
            }else map.put(sum, i);
        }
        return maxlen;
    }
}