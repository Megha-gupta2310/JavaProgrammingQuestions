
public class RemoveVowelsFromString {
  public static void main(String args[]) {
	String str = "thisisstupid";
	 String notVowel = "";
	

for (int i =0; i<str.length();i++) {
	if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i)== 'i'|| str.charAt(i) == 'o'||  str.charAt(i) =='u' || 
			str.charAt(i)== 'A' ||  str.charAt(i) == 'E' || str.charAt(i) == 'I' ||   str.charAt(i)== 'O' || str.charAt(i) == 'U') {
		
		
	}else {
		notVowel += str.charAt(i);
	}
	
}
System.out.print(notVowel);
  }
}
