package leetcode;

import java.util.ArrayList;
import java.util.List;

	public class KidsWithGreatestCandies {
	    public static void main(String[] args) {
	        int[] candies1 = {2, 3, 5, 1, 3};
	        int extraCandies1 = 3;
	        System.out.println(kidsWithCandies(candies1, extraCandies1));

	    }

	    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int maxCandies = getMaxCandies(candies);

	        List<Boolean> result = new ArrayList<>();

	        for (int candy : candies) {
	            result.add(candy + extraCandies >= maxCandies);
	        }

	        return result;
	    }

	    private static int getMaxCandies(int[] candies) {
	        int max = candies[0];
	        for (int i = 1; i < candies.length; i++) {
	            if (candies[i] > max) {
	                max = candies[i];
	                System.out.println(max);
	            }
	        }
	        return max;
	    }
	}
