class Solution {
    public boolean isPal(int i, int j, String st){
        while(i<=j){
            if(st.charAt(i) != st.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void str_part(int ind,String st, List<List<String>> ans, List<String> temp){
        if(ind == st.length()){
            
            List<String> curr =new ArrayList<>();
            curr.addAll(temp);
            ans.add(curr);
            return;
        }
        for(int j=ind; j<st.length(); j++){
            if(isPal(ind, j, st)){
                temp.add(st.substring(ind, j+1));
                str_part(j+1, st, ans, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp =new ArrayList<>();
        str_part(0, s, ans, temp);
        return ans;
    }
}