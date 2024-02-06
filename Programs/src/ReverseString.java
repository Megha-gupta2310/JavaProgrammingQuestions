
public class ReverseString {
	
	public static void main(String args[]) {
		
		String str = "hello";
		char s[] = str.toCharArray();
		
		int j = s.length-1;
		int i=0;
		while(i<j) {
			char temp = s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
			
		}
		String string = new String(s);	
		System.out.println(string);
	}

}
