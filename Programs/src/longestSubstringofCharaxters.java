import java.util.Arrays;

public class longestSubstringofCharaxters {
	
	public static void main(String args[]) {
		String str = "HapppyI%&&87Christmas%%$^%&NewYear";
		
		String str1 = str.replaceAll("[^a-zA-Z]"," ");
		String[] str2 = str1.split(" ");
		int temp = 0;
		String longestWord = "";
		
		for(int i = 0;i<str2.length;i++) {
			if(!str2[i].equals("")) {
			if(temp<str2[i].length()) {
				temp = str2[i].length();
				longestWord = str2[i];
				
			}
		}
		}
		System.out.println(longestWord + "in the longest Word with "+ temp + "Characters");
	}

}
