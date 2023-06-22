class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] left= new int[n];
        int [] right= new int[n];
        int max=0;
        for(int i=0; i<n; i++){
            left[i]= Math.max(height[i], max);
            max= Math.max(height[i], max);
        }
        max=0;
        for(int i=n-1; i>=0; i--){
            right[i]= Math.max(height[i], max);
            max= Math.max(height[i], max);
        }
        // for(int i=0; i<n; i++) System.out.print(left[i]+" ");
        // System.out.println();
        // for(int i=0; i<n; i++) System.out.print(right[i]+" ");
        int ans=0;
        for(int i=0; i<n; i++){
            int diff = Math.min(left[i], right[i]) - height[i];
            if(diff > 0) ans += diff;
        }
        return ans;
    }
}