package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqueCharater {
	public static void main(String args[]) {
	
	String s = "aabb";
	char c[]  = s.toCharArray();
	
	LinkedHashMap<Character, Integer> ls = new LinkedHashMap<>();
	
	for(char ch : c) {
	
		ls.put(ch, ls.getOrDefault(ch,0)+1);
	}
	
	for(Map.Entry<Character, Integer> e: ls.entrySet()){
		if(e.getValue()==1) {
			
			break;
		}
		
	}

}}
