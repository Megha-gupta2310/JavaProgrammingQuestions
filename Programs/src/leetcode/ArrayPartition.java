package leetcode;

import java.util.Arrays;

public class ArrayPartition {
	
	public static void main(String args[]) {
		
		int n[] =  {1,4,3,2};
		
		int sum= 0;
		Arrays.sort(n);
		
		for(int i=0;i<n.length-1;i+=2) {
			sum+=n[i];
		}
		
		System.out.println(sum);
		
	}

}
