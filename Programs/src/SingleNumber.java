import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	
	public static void main(String args[]) {
		int []nums = {2,1,1};
		
		int temp = 0;
		
		 HashMap<Integer, Integer> charMap = new HashMap<Integer, Integer>();
	        for (Integer ch : nums) {
	            if (charMap.containsKey(ch)) {
	                charMap.put(ch, charMap.get(ch) + 1);

	            } else {
	                charMap.put(ch, 1);
	            }
	            
	            
	}
	        for (Map.Entry m : charMap.entrySet()) {
	        	if(m.getValue().equals(1))
    			temp =  (int) m.getKey();
    		}
System.out.println(temp);}}
