package leetcode;

import java.util.Arrays;

public class REverseString {
	
	public static void main(String args[]) {
		String s = "hello";
		char c[] = s.toCharArray();
		
		
		
		StringBuilder str = new StringBuilder(s);
		String t = str.reverse().toString();
		
		//System.out.println(t.toString());
		
		t.toCharArray();
		
		
		int j= c.length-1;
		for(int i=0;i<c.length;i++) {
			if(i<j) {
				char temp = c[i];
				c[i]=c[j];
				c[j]=temp;
				
				j--;
			}
			
		}
		
		char u[] = t.toCharArray();
		System.out.println(t.toCharArray());
		
		
	}

}
