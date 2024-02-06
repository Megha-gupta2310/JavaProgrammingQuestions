import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstUniqueCharacter {
	
	public static void main (String args[]) {
		
		String s = "aabb";
		char[] str = s.toCharArray();
		Character unique = null;
		 LinkedHashMap<Character, Integer> map 
			= new LinkedHashMap<Character, Integer>(); 
     
		 for (char c : str) {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
			}
		 
		  for (Map.Entry<Character, Integer> m : map.entrySet()) {
	        	if(m.getValue().equals(1)) {
	        		System.out.println(m.getKey());
	        		unique= m.getKey();
	        		break;
	        	}else {
	        		
	        	}
	        	
	        
		
	} System.out.println(s.indexOf(unique));

	}}
