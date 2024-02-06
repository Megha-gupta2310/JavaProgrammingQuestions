package leetcode;

import java.util.Arrays;

public class ReverseWordsInastring {
	
	public static void main(String args[]) {
		String s = "geeks quiz practice code";
				String	c[] = s.split("\\s+"); 
				int i =0;
				int j = c.length-1;
				while(i<j) {
					String temp = c[i];
					c[i]= c[j];
					c[j]= temp;
					i++;
					j--;
				}
				
				 StringBuilder result = new StringBuilder();

			        // Append each word to the StringBuilder with a space in between
			        for (String word : c) {
			            result.append(word).append(" ");
			        }
			        
			        System.out.println(result);
	}

}
