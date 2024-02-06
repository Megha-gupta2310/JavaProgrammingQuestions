package leetcode;

import java.util.HashSet;

public class MinimumWindowsubstring {
	
	public static void main(String args[]) {
		String str = "abcadcbb";
		System.out.println(lengthOfLongestSubstring(str));
		
	}
		
		
		    public static int lengthOfLongestSubstring(String s) {
		        if (s == null || s.length() == 0) {
		            return 0;
		        }

		        HashSet<Character> charSet = new HashSet<>();
		        int maxLength = 0;
		        int start = 0;
		        int end = 0;

		        while (end < s.length()) {
		            char currentChar = s.charAt(end);

		            if (!charSet.contains(currentChar)) {
		                // If the character is not in the set, add it and update maxLength
		                charSet.add(currentChar);
		                maxLength = Math.max(maxLength, end - start + 1);
		                end++;
		            } else {
		                // If the character is in the set, remove the start character and move start pointer
		                charSet.remove(s.charAt(start));
		                start++;
		            }
		        }

		        return maxLength;
		    }
		}

