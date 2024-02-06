import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharacters {
	
	public static void main(String args[]) {
		String word = "Programming";
		char[] str = word.toCharArray();
		/*
		 * HashMap<Character,Boolean> mp = new HashMap<>(); for(int i=0;
		 * i<str.length;i++) { if(mp.get(str[i])==null) { System.out.print(str[i]);
		 * mp.put(str[i], true); } }
		 */
		
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : str) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);

            } else {
                charMap.put(ch, 1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        Set<Character> keys = charMap.keySet(); 
        for (Character ch : keys) {  
            if (charMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + charMap.get(ch) + " times");  
            }  
        
        }
    }  }
       
