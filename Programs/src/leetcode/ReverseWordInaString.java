package leetcode;

import java.util.Arrays;

public class ReverseWordInaString {
	
	public static void main(String args[]) {
		String s = "the sky is blue";
		
		String st[] = s.split(" ");
		int i=0;
		int j=st.length-1;
		while(i<j) {
			String temp = st[i];
			st[i]=st[j];
			st[j]=temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(st));
	}

}
