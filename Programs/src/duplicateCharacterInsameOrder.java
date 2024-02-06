import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class duplicateCharacterInsameOrder {
	
	public static void main(String args[]) {
		
		String str = "ddabbaccdbac";
		char[] charArray = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		/*StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			 if (entry.getValue() > 1) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());}
		}
		System.out.println(sb.toString());
	}*/
	
	  Set<Character> keys = map.keySet(); 
      for (Character ch : keys) {  
          if (map.get(ch) > 1) {  
              System.out.println(ch + "  is " + map.get(ch) + " times");  
          }  
      }  
  }  }

