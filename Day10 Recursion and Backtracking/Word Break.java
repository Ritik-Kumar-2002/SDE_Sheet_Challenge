import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static void Word_break(String input,String res, ArrayList<String> series, 
	ArrayList<String> ans) {
		if(input.length()==0) {
			// System.out.println(res);
			ans.add(res);
			return;
		}
		for(int i=0; i<input.length(); i++) {
			String prefix = input.substring(0,i+1);
//			System.out.println("prefix "+prefix);
			if(series.contains(prefix)) {
				String right = input.substring(i+1);
				Word_break(right,res+prefix+" ", series,ans );
			}
		}
		
	}

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		ArrayList<String> ans = new ArrayList<>();
		Word_break(s, "", dictionary, ans);
		return ans;
	}
}