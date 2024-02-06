package leetcode;

import java.util.Arrays;

public class REverseinteger {
	public static void main(String args[]) {
	int num =1234;
	 String temp = Integer.toString(num);
	 StringBuilder s = new StringBuilder(Integer.toString(num));
	 s.reverse();
	 
	 String st = s.toString();
	 int[] arr = new int[s.length()];
	
	 System.out.println(s);
	
	 System.out.println(Arrays.toString(arr));
	 int reversed = 0;
//	    while(num != 0) {
//		int digit = num%10;
//		reversed = reversed*10+digit;
//		num/=10;
//	}
	    
	    
	    
   
}
}