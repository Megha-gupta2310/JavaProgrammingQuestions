// Java implementation of the above approach 
import java.util.*; 

/*Input: arr[] = {5, 10, 12, 13, 15, 18}, K = 30
Output: {12, 18}, {5, 12, 13}, {5, 10, 15}
Explanation: 
Subsets with sum 30 are:
12 + 18 = 30
5 + 12 + 13 = 30
5 + 10 + 15 = 30

Input: arr[] = {1, 2, 3, 4}, K = 5
Output: {2, 3}, {1, 4}*/

/*
power set - https://www.geeksforgeeks.org/power-set/
*/

public class perfectSumProblem { 

	// Function to print the subsets whose 
	// sum is equal to the given target K 
	public static void sumSubsets( 
		int set[], int n, int target) 
	{ 
		// Create the new array with size 
		// equal to array set[] to create 
		// binary array as per n(decimal number) 
		int x[] = new int[set.length]; 
		int j = set.length - 1; 

		// Convert the array into binary array 
		while (n > 0) { 
			x[j] = n % 2; 
			n = n / 2; 
			j--; 
		} 

		int sum = 0; 

		// Calculate the sum of this subset 
		for (int i = 0; i < set.length; i++) 
			if (x[i] == 1) 
				sum = sum + set[i]; 

		// Check whether sum is equal to target 
		// if it is equal, then print the subset 
		if (sum == target) { 
			System.out.print("{"); 
			for (int i = 0; i < set.length; i++) 
				if (x[i] == 1) 
					System.out.print(set[i] + ", "); 
			System.out.print("}, "); 
		} 
	} 

	// Function to find the subsets with sum K 
	public static void findSubsets(int[] arr, int K) 
	{ 
		// Calculate the total no. of subsets 
		int x = (int)Math.pow(2, arr.length); 

		// Run loop till total no. of subsets 
		// and call the function for each subset 
		for (int i = 1; i < x; i++) 
			sumSubsets(arr, i, K); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		int arr[] = { 5, 10, 12, 13, 15, 18 }; 
		int K = 30; 

		findSubsets(arr, K); 
	} 
} 
