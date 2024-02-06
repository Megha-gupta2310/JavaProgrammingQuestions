            
public class toLowerCase {
	public static void main(String args[]) {
		String s = "HelLo";
		StringBuffer newStr=new StringBuffer(s);    
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				  newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));    
			}
		}
		System.out.println(newStr);
	}

}
