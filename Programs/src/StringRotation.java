
public class StringRotation {
	
	public static void main (String args[]) {
		String str1 = "avajava";
		String str2 = "javaaaa";
		if(str1.length()!=str2.length()) {
			System.out.print(false);
			
		}else {
		
		String str3 = str1+ str2;
		
		  if(str3.contains(str1)) 
		  { 
			  System.out.print(true); 
			  } else
			  {
		  System.out.print(false); }
		}}
		
		/*
		 * if (str3.indexOf(str2) != -1) { System.out.print(true); } else {
		 * System.out.print(false); }
		 */
			
		
	

}
