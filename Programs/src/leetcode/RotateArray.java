package leetcode;

import java.util.Arrays;

public class RotateArray {
 public static void main(String args[]) {
	 int num[] = {1,2,3,4,5,6,7};
	 int k = 3;
	 
	 int j= num.length-1;
	 for(int i=0;i<=k;) {
		 int temp = num[i];
		 num[i] = num[j];
		 num[j]=temp;
		 i++;
		 j--;
	 }
	 
	 System.out.println(Arrays.toString(num));
	 
 }
}
