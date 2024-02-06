package leetcode;

import java.util.Arrays;

public class ShortestUnsortedContinousArray {
   public static void main(String args[]) {
	   
	   int n[] = {2,6,4,8,10,9,15};
	   
	   int  arr[] = new int[n.length];
	   
	   System.arraycopy(n, 0, arr, 0, n.length);
	   Arrays.sort(arr);
	   int i=0;
	   int end = n.length-1;
	   
	   for(;i<n.length;i++) {
		   if(n[i]!=arr[i]) break;
		   
	   }
	   
	   
	   for(;end>0;end--) {
		   if(n[end]!=arr[end]) break;
		   
	   }
	   
	   System.out.println(end-i+1);
   }
}
