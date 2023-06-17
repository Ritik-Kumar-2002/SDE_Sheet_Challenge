import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=-1, j=-1, n = s.length();
        int max = 0;
        while(true){
            boolean flag1= false, flag2 = false;
            while(j<n-1 && j-i == map.size()){
                j++;
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c,0)+1);

                if(map.get(c) == 2) break;
                else {
                    if(j-i > max) max= j-i;
                }
                flag1 = true;
            } 
            System.out.println("map "+map+ " "+ map.size());
            while(i<j && j-i > map.size()){
                i++;
                char c = s.charAt(i);
                if(map.get(c) == 1 ) map.remove(c);
                else map.put(c, map.get(c)-1);
                // System.out.println("map " + map + " "+map.size()+ " len "+ (j-i));
                flag2 = true;
            }
            
            if(flag1 == false && flag2 == false) break;
        }
        return max;
    }
}