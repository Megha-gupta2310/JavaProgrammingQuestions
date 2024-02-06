package leetcode;

public class mergeTwoString {
	
	public static void main(String args[]) {
		String word1= "abc";
		String word2 = "pqr";
		int newlen = word1.length()+word2.length();
		StringBuilder br = new StringBuilder(newlen);
		
		int i = 0, j=0;
		
		while(i<word1.length()||j<word2.length()) {
			if(i<word1.length()) {
			br.append(word1.charAt(i));
			i++;
		}
		
			if(j<word2.length()) {
				br.append(word2.charAt(j));
				j++;
			}
		
	}
		
		System.out.println(br.toString());

}}
