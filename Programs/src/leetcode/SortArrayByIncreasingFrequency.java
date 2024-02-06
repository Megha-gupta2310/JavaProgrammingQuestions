package leetcode;

import java.util.*;

import java.util.*;

public class SortArrayByIncreasingFrequency {
	import java.util.*;

	class NumFrequency implements Comparable<NumFrequency> {
	    int num;
	    int frequency;

	    public NumFrequency(int num, int frequency) {
	        this.num = num;
	        this.frequency = frequency;
	    }

	    @Override
	    public int compareTo(NumFrequency other) {
	        // Sort by frequency in ascending order
	        if (this.frequency != other.frequency) {
	            return Integer.compare(this.frequency, other.frequency);
	        }
	        // If frequencies are the same, sort by number in descending order
	        return Integer.compare(other.num, this.num);
	    }
	}

	public class SortArrayByIncreasingFrequency {
	    public static int[] frequencySort(int[] nums) {
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        for (int num : nums) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        NumFrequency[] numFrequencyArray = new NumFrequency[nums.length];
	        int index = 0;

	        for (int num : frequencyMap.keySet()) {
	            numFrequencyArray[index++] = new NumFrequency(num, frequencyMap.get(num));
	        }

	        Arrays.sort(numFrequencyArray);

	        index = 0;
	        for (NumFrequency nf : numFrequencyArray) {
	            for (int i = 0; i < nf.frequency; i++) {
	                nums[index++] = nf.num;
	            }
	        }

	        return nums;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 2, 3};
	        int[] result = frequencySort(nums);

	        System.out.println(Arrays.toString(result)); // Output: [3, 1, 1, 2, 2, 2]
	    }
	}
