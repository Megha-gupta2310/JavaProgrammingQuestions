package leetcode;

import java.util.HashMap;
import java.util.Map;

public class duplicate {
	public static void main(String args[]) {
		int nums[] = {1,2,3,1};
		
		HashMap<Integer, Integer> hs  = new HashMap<>();
		
		for(int num:nums) {
			hs.put(num, hs.getOrDefault(num, 0)+1);
			
		}
		
		for(Map.Entry<Integer, Integer> e: hs.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				
			}
		}
		
		
	}

}
