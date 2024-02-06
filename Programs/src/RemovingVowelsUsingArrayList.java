import java.util.Arrays;
import java.util.List;

public class RemovingVowelsUsingArrayList {
	static String remVowel(String str) 
    { 
         Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
           
         List<Character> al = Arrays.asList(vowels); 
           
         StringBuffer sb = new StringBuffer(str); 
           
         for (int i = 0; i < sb.length(); i++) { 
              
             if(al.contains(sb.charAt(i))){ 
            	 System.out.println(i);
            	 System.out.println(i+1);
                sb.replace(i, i+1, "") ; 
                System.out.println(sb.toString());
                i--; 
                System.out.println(i);
             } 
        } 
           
          
        return sb.toString(); 
    } 
    // Driver method to test the above function 
    public static void main(String[] args)  
    { 
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks"; 
          System.out.println(remVowel(str));
          
          //Another method
        String str1 = "Deekshit Prasad";
        System.out.println("Given string: " + str1);
        str1 = str1.replaceAll("[AaEeIiOoUu]", "");
        System.out.println("After deleting vowels in given a string: " + str1);
    } 

}
