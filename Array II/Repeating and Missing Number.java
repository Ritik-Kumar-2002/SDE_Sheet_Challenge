import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int Resum=0, RealSq = 0, arsum=0, arSq=0;
        Resum = ((n+1)*n)/2;
        RealSq = (n*(n+1)*(2*n+1))/6;
        for(Integer elem: arr) {
            arsum += elem;
            arSq += (elem*elem);
        }
        // System.out.println("n "+n);
        // System.out.println("real sum arr sum "+ Resum+" "+arsum);
        // System.out.println("real mis arr sq "+RealSq+" "+arSq);
        int Rep_Mis= arsum-Resum;
        int Rep_plus_Mis = (arSq - RealSq)/Rep_Mis;
        // System.out.println("rep-mis "+ Rep_Mis);
        // System.out.println("rep+mis "+Rep_plus_Mis);
        int RepetitingNum = (Rep_Mis+Rep_plus_Mis) / 2;
        int MissingNum = (Math.abs(Rep_Mis-Rep_plus_Mis))/2;
        int [] ans = {MissingNum, RepetitingNum};
        return ans;
    }
}