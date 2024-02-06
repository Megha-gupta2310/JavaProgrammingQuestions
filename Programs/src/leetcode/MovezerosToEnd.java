package leetcode;

import java.util.Arrays;

public class MovezerosToEnd {
	public static void main(String args[]) {
    int a[] = {1,0,0,3,4,2};
    int j = a.length-1;
    
    for(int i=0;i<a.length;i++) {
    	if(a[i]==0&&i<j) {
    		int temp = a[i];
    		a[i]= a[j];
    		a[j]= temp;
    		j--;
    	}
    }
    System.out.println(Arrays.toString(a));
}}
