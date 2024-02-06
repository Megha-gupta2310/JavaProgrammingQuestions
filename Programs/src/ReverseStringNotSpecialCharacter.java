import java.util.Arrays;

public class ReverseStringNotSpecialCharacter {
  public static void main(String args[]) {
	  String str = "a-bc-dEf-ghIj";
	  char s[] = str.toCharArray();
	  int j= s.length-1;
	 int i = 0;
		  while(i<j) {
		  if (!Character.isLetter(s[i]))
			  
		  {
			  i++;
			  
		  }else if(!Character.isLetter(s[j])){
			  j--;
		  }
		  
		  else{
			  char temp = s[i];
			  s[i]=s[j];
			  s[j]=temp;
			  i++;
			  j--;
			  
				 
			  }
		    
		  }
		  
  
	 String string = new String(s);	  
	 System.out.print(string);
	 
}
}