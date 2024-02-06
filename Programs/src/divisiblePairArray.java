// Java program to count 
// divisible pairs. 
/*  Count the numbers from a list which is purely divisible by the sum of rest
(3,9,4,5)
(9+4+5)/3 - Remainder 0 count 1
(3+4+5)/9 - Remainder not 0 count - 1
(3+9+5)/4 - Remainder
4- 3+9+5*/
public class divisiblePairArray { 
      
// Function returns count 
// of divisible pairs 
static int countDivisibles(int arr[],  
                              int n) 
{ 
    int res = 0; 
  
    // Iterate through all pairs 
    for (int i = 0; i < n; i++)  
        for (int j = i + 1; j < n; j++)  
          
        // Increment count if 
        // one divides other 
        if (arr[i] % arr[j] == 0 ||  
            arr[j] % arr[i] == 0)  
            res++; 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = new int[]{1, 2, 3, 9}; 
    int n = a.length; 
    System.out.print(countDivisibles(a, n)); 
} 
} 
  
// This code is contributed by Smitha. 