package leetcode;

public class LongestCommonPrefix {
	
	
	
		    public static String longestCommonPrefix(String[] strs) {
		        if (strs == null || strs.length == 0) {
		            return "";
		        }

		        String prefix = strs[0]; // Initialize with the first string

		        for (int i = 1; i < strs.length; i++) {
		            int j = 0;
		            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
		                j++;
		            }

		            if (j == 0) {
		                return ""; // No common prefix
		            }

		            prefix = prefix.substring(0, j); // Update prefix with common part
		        }

		        return prefix;
		    }

		    public static void main(String[] args) {
		        String[] strings = {"flower", "flow", "flight"};
		        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strings));
		    }
		}
