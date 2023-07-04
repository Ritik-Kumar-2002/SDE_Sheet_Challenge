class Solution {
    public String reverseWords(String s) {
        String S = s.trim();
        String[] st_arr = S.split(" ");
        
        StringBuilder sb = new StringBuilder("");
        int n = st_arr.length;
        for(int i=n-1; i>=0; i--){
            if(st_arr[i].length() != 0){
                if(i!=0){
                // System.out.println(st_arr[i]+" "+st_arr[i].length());
                sb.append(st_arr[i] +" ");
                }else{
                    // System.out.println(st_arr[i]+" "+st_arr[i].length());
                    sb.append(st_arr[0]);
                } 
            }
            
        }
		return sb.toString();
    }
}