package leetcode;

import java.util.Arrays;

public class ValidPalindrome {
	
	public static void main(String args[]) {
		String  s = "A man, a plani, a canal: Panama";
		
		String t = s.toLowerCase().replaceAll("\\s+","").trim().replaceAll("[^a-zA-Z0-9]","");
		System.out.println(t);
		 char c[] =  t.toCharArray();
		 int i= c.length-1;
		 int j=0;
		while(i>j) {
			char temp = c[i];
			c[i]= c[j];
			c[j]=temp;
			j++;
			i--;
		}
		String rt = new String(c);
		System.out.println(rt);
		System.out.println(t.length());
		System.out.println(rt.length());
		System.out.println(t.compareTo(rt)==0);
	}

}
