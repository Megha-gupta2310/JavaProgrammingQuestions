package leetcode;

public class LongestVowelSubstring {
	public static void main(String args[]) {
		String s = "rbciiidef";
		int k =3;
	   
	        int maxVowels = 0;
	        int currentVowels = 0;

	        // Count vowels in the first substring of length k
	        for (int i = 0; i < k; i++) {
	            if (isVowel(s.charAt(i))) {
	                currentVowels++;
	            }
	        }

	        maxVowels = currentVowels;

	        // Iterate through the rest of the string using sliding window
	        for (int i = k; i < s.length(); i++) {
	            // Remove the leftmost character from the current substring
	            if (isVowel(s.charAt(i - k))) {
	                currentVowels--;
	            }

	            // Add the new character to the current substring
	            if (isVowel(s.charAt(i))) {
	                currentVowels++;
	            }

	            // Update the maximum number of vowels
	            maxVowels = Math.max(maxVowels, currentVowels);
	        }

	        System.out.println(maxVowels);
	    }

	    private static boolean isVowel(char c) {
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	}


