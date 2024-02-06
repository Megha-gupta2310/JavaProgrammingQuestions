package leetcode;

public class MaxconsecutiveNums {

	
	    public static void main(String[] args) {
	        int arr[] = {1,0, 1, 1, 0,1};
	        int currentCount = 0;
	        int maxCount = 0;

	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                currentCount++;
	            } else {
	                // Check if the current consecutive count is greater than the maximum
	                maxCount = Math.max(maxCount, currentCount);
	                // Reset the current consecutive count
	                currentCount = 0;
	            }
	        }

	        // Check again after the loop (for the last element)
	        maxCount = Math.max(maxCount, currentCount);

	        System.out.println("Maximum Consecutive Occurrences: " + (maxCount + 1)); // Adding 1 to count the first element
	    }
	}
