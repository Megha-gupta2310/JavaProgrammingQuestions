package leetcode;

import java.util.Arrays;

public class reversevowels {

	public static void main(String args[]) {
		String s = "hello";
		
		char[] th = s.toCharArray();
		int i =0;
		int j=th.length-1;
		
		while(i<j) {
			if (isVowel(th[i]) && isVowel(th[j])) {
				
			 char temp = th[i];
			 th[i]=th[j];
			 th[j]= temp;
			 i++;
			 j--;
		}else if (isVowel(th[i])) {
            // Move the right pointer if the character at right is not a vowel
            j--;
        } else {
            // Move the left pointer if the character at left is not a vowel
            i++;
        }
		
		
		
		
	}
		
		
		
		
	
	
}
	

	 private static	boolean isVowel(char c) {
        // Check if the character is a vowel (case-insensitive)
        return "aeiouAEIOU".indexOf(c) != -1;
    }}
