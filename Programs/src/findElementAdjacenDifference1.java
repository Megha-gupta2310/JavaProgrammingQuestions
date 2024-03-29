// Java program to search an element in an 
// array where difference between all 
// elements is 1 

import java.io.*; 

/*Find a element with best feasible and optimized solution

Input -: 33,34,35,36,37,38,39,40,41

Difference between the two element will always be 1 .

Solution -: Binary search is what i used here.*/

public class findElementAdjacenDifference1 { 
	
	// x is the element to be searched 
	// in arr[0..n-1] 
	static int search(int arr[], int n, int x) 
	{ 
		
		// Traverse the given array starting 
		// from leftmost element 
		int i = 0; 
		while (i < n) 
		{ 
			
			// If x is found at index i 
			if (arr[i] == x) 
				return i; 
	
			// Jump the difference between current 
			// array element and x 
			i = i + Math.abs(arr[i]-x); 
		} 
	
		System.out.println ("number is not" + 
									" present!"); 

		return -1; 
	} 

	// Driver program to test above function 
	public static void main (String[] args) { 
		
		int arr[] = {8 ,7, 6, 7, 6, 5, 4, 3, 
								2, 3, 4, 3 }; 
		int n = arr.length; 
		int x = 3; 
		System.out.println("Element " + x + 
						" is present at index "
							+ search(arr,n,3)); 
	} 
} 

//This code is contributed by vt_m. 
