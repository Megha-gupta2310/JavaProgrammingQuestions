package leetcode;

import java.util.Arrays;

public class ThirdMaximumNumber {
	
	 public static int thirdMax(int[] nums) {
	        Arrays.sort(nums);
	        int n = nums.length;
	        int distinctCount = 1;

	        for (int i = n - 2; i >= 0; i--) {
	            if (nums[i] != nums[i + 1]) {
	                distinctCount++;
	            }

	            if (distinctCount == 3) {
	                return nums[i];
	            }
	        }

	        return nums[n - 1];
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 2, 1};
	        int result = thirdMax(nums);
	        System.out.println("Third distinct maximum number: " + result);
	    }
	}