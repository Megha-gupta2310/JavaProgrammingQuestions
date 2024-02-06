import java.util.HashMap;
import java.util.Map;

public class Anagram2Strings {
	
	public static void main(String args[]) {
		String s1= "a";
		String s2 = "ab";
		System.out.println(checkAnagram(s1,s2));	
	}
	
		
		   public static boolean checkAnagram(String s1, String s2)
		    {
		        if (s1.length() != s2.length())
		            return false;
		        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		        for (int i = 0; i < s1.length(); i++)
		        {
		            char c = s1.charAt(i);
		            if (map.containsKey(c))
		                map.put(c, map.get(c) + 1);
		            else
		                map.put(c, 1);
		        }
		        for (int i = 0; i < s2.length(); i++)
		        {
		            char c = s2.charAt(i);
		            if (map.containsKey(s2.charAt(i)))
		            {
		                if (map.get(c) == 1)
		                    map.remove(c);
		                else
		                    map.put(c, map.get(c) - 1);
		            } else
		                return false;
		        }
		        if (map.size() > 0)
		            return false;
		        return true;
		    }
		

}
