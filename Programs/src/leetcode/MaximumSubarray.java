package leetcode;

public class MaximumSubarray {

	    public static int maxSubArray(int[] nums) {
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;

	        for (int num : nums) {
	            currentSum += num;

	            // If the current sum becomes negative, reset it to the current element
	            if (currentSum < num) {
	                currentSum = num;
	            }

	            // Update the maximum sum if the current sum is greater
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
	    }
	}


