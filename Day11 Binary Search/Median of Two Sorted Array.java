class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int [] num = new int[n+m];
        int i=0, j=0,k=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                num[k] = nums1[i];
                i++;
                k++;
            }else {
                num[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            num[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            num[k] = nums2[j];
            j++;
            k++;
        }
        if(num.length%2 != 0) return num[num.length/2];
        return (double)(num[num.length/2]+num[num.length/2 - 1])/2;
        // System.out.println("sum "+sum);
        // return sum/2;
    }
}