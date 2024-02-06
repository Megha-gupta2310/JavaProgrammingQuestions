package leetcode;

import java.util.ArrayList;

public class PlusOne {
	
	public static void main(String args[]) {
		int a[]= {9,1,9};
		int j=0;
	   int carry =0;
	   int output = 0;
	   
	   for(int i=a.length-1;i>=0;i--) {
		   int num = a[i];
		   if(i==a.length-1) {
			   output = num+1;
			   
		   }else {
			   output = num+carry;
		   }
		   if(output>=10) {
			   output = output-10;
			   carry =1;
			   System.out.println(output);
		   }else {
			   carry=0;
			   System.out.println(output);
		   }
		   
		   
	   }
	   
	   System.out.println(output);
	
		
		
	
		
		
		
	}

}
