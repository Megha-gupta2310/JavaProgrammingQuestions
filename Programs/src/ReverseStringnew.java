import java.util.Arrays;

public class ReverseStringnew {
	
	public static void main(String args[]) {
		String str = "LPL FINANCIAL";
		   char ch[] = str.toCharArray();
		   
		  int j = ch.length-1;
		  
		  int i=0;
		  while(i<j) {
			  
			  
			  Character c = ch[i];
			  ch[i]= ch[j];
			  ch[j] = c;
			  i++;
			  j--;
			  
		  }
		  
	
		
		  
		  System.out.print(Arrays.toString(ch));
		   
	}
	
	

   
   

}
