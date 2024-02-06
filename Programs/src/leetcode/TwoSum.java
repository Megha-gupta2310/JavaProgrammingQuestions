package leetcode;

public class TwoSum {
    public static void main(String args[]) {
    	int a[] = {11,7,15,2};
    	int target = 9;
    	
    	for(int i=0;i<a.length-1;i++) {
    		for(int j=i+1;j<a.length;j++) {
    	if(a[i]+a[j]==target) {
    			System.out.println(i);
    			System.out.println(j);
    		}
    	}
    }
	
	
}
}