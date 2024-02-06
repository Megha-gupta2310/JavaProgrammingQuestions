// Java program to sort a string according to the 
// order defined by a pattern string 
  
public class SortStringAccordingToPattern { 
  
    static int MAX_CHAR = 26; 
  
    // Sort str according to the order defined by pattern. 
    static void sortByPattern(char[] str, char[] pat) 
    { 
        // Create a count array stor 
        // count of characters in str. 
        int count[] = new int[MAX_CHAR]; 
  
        // Count number of occurrences of 
        // each character in str. 
        for (int i = 0; i < str.length; i++) { 
            count[str[i] - 'a']++; 
        } 
  
        // Traverse the pattern and print every characters 
        // same number of times as it appears in str. This 
        // loop takes O(m + n) time where m is length of 
        // pattern and n is length of str. 
        int index = 0; 
        for (int i = 0; i < pat.length; i++) { 
            for (int j = 0; j < count[pat[i] - 'a']; j++) { 
            	str[index++] = pat[i]; 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        char[] pat = "obcd".toCharArray(); 
        char[] str = "bacc".toCharArray(); 
        sortByPattern(str, pat); 
        System.out.println(String.valueOf(str)); 
    } 
} 