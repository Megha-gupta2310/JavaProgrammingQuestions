package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersection2arrays {
	public static void main(String args[]) {
		int num1[]= {1,2,2,2,1};
		int num2[] = {2,2,2};
		
		
		ArrayList<Integer> as = new ArrayList<>();
		
		
		HashMap<Integer, Integer> hs1 = new HashMap<>();
		HashMap<Integer, Integer> hs2 = new HashMap<>();
		for(int i =0;i<num1.length;i++) {
			hs1.put(num1[i], hs1.getOrDefault(num1[i], 0) + 1);
			
		}
		for(int i =0;i<num2.length;i++) {
			hs2.put(num2[i], hs2.getOrDefault(num2[i], 0) + 1);
			
		}
		
	for(Map.Entry<Integer, Integer> e:hs1.entrySet()) {
	        int key = e.getKey();
	        
	        if(hs2.containsKey(key)) {
	        	int count = Math.min(hs1.get(key), hs2.get(key));
	        	for(int i=0;i<count;i++) {
	        		as.add(key);
	        		
	        	}
	        
		}
	      
	}
	  System.out.println(as);
		
		
	}

}
