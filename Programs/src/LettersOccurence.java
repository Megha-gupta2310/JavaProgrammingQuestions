import java.util.HashMap;

public class LettersOccurence {
	
	
	public static void main(String args[]) {
		
		String str = "Programming";
		
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(Character ch : str.toCharArray()) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
				
			}
			else {
				mp.put(ch,1);
			}
			
		}
		
		System.out.println(mp);
		
	}

}
