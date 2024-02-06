package leetcode;

public class LongestSubstring {
	
	public static void main(String args[]) {
		String s = "babad";
		StringBuilder bs = new StringBuilder();
		StringBuilder jk =  new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			bs.append(s.charAt(i));
			if(bs.reverse().equals(bs)&&bs.length()>1) {
				jk = bs;
			}
		
		}
	}

}
