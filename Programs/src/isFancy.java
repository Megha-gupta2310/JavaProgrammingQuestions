// Java program to find if a given number 
// is fancy or not 
import java.util.*; 

public class isFancy 
{ 
static boolean isFancy(String num) 
{ 
	// To store mappings of fancy pair characters. 
	// For example 6 is paired with 9 and 9 is paired with 6. 
	Map<Character, 
		Character> fp = new HashMap<Character, 
									Character>(); 
									
	fp. put('0', '0'); 
	fp. put('1', '1'); 
	fp. put('6', '9'); 
	fp. put('8', '8'); 
	fp. put('9', '6'); 

	// Find number of digits in given number 
	int n = num.length(); 

	// Traverse from both ends, 
	// and compare characters one by one 
	int l = 0, r = n-1; 
	while (l <= r) 
	{ 
		// If current characters at both ends 
		// are not fancy pairs 
		if (!fp.containsKey(num.charAt(l)) || 
			fp.get(num.charAt(l)) != num.charAt(r)) 
			return false; 
		l++; 
		r--; 
	} 
	return true; 
} 

// Driver Code 
public static void main(String[] args) 
{ 
	String str = "9088806"; 
	if(isFancy(str)) 
		System.out.println("Yes"); 
	else
		System.out.println("No"); 
} 
} 

