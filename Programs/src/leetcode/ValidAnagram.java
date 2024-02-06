package leetcode;

import java.util.HashMap;

public class ValidAnagram {
   public static void main(String args[]) {
	   String s  = "rat";
			   char cs[] = s.toCharArray();
		String 	   t = "car";
		char ct[] = t.toCharArray();
		
		HashMap<Character, Integer> mp = new HashMap<>();
		HashMap<Character, Integer> mp2 = new HashMap<>();
		for(char c:cs) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		for(char c:ct) {
			mp2.put(c, mp2.getOrDefault(c, 0)+1);
		}
		
		if(mp.equals(mp2)){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
   }
}
