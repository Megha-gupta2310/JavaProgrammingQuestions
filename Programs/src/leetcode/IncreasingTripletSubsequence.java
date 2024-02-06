package leetcode;

public class IncreasingTripletSubsequence {
	
	public static void main(String args[]) {
		int nums[] = {1,2,3,4,5};
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		 for (int num : nums) {
	            if (num <= first) {
	                first = num; // Update the smallest element
	            } else if (num <= second) {
	                second = num; // Update the second smallest element
	            } 
	        }
		
		 
		 
		
		
	
	}

}
