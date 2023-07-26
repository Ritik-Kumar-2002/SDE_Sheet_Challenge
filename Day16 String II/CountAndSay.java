class Solution {
    public String build(String s){
        String res="";
        int freq=1;
        char c = s.charAt(0);
        int n = s.length();
        for(int i=1; i<n; i++){
            if(s.charAt(i) == c){
                freq++;
            }else{
               
                res += Integer.toString(freq);
                res += c;
                c = s.charAt(i);
                freq=1;
            }
        }

        res += Integer.toString(freq);
        res += c;
        
        return res;
    }
    public String countAndSay(int n) {
        String initial="1";
        for(int i=0; i<n-1; i++){
            initial = build(initial);
        }
        return initial;
    }
}