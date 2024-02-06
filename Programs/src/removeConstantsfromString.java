import java.util.Arrays;
import java.util.List;
public class removeConstantsfromString
{
   public static void main(String[] args) 
   {
      String str = "hello world core java";
      System.out.println("Remove consonants from a string: ");
      System.out.println(removeConsonantsFunction(str));
   }
//   static boolean checkAlphabet(char ch) 
//   { 
//      if(ch >= 'a' && ch <= 'z')
//         return true;
//      if(ch >= 'A' && ch <= 'Z') 
//         return true; 
//      return false; 
//   }
   static String removeConsonantsFunction(String strConsonant)
   {
      Character[] chVowel = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
      List<Character> li = Arrays.asList(chVowel);
      StringBuffer sb = new StringBuffer(strConsonant);
      for(int a = 0; a < sb.length(); a++)
      {
         if(Character.isLetter(sb.charAt(a)) && !li.contains(sb.charAt(a))) 
         { 
            sb.replace(a, a + 1, ""); 
            a--; 
         }
      }
      return sb.toString(); 
   }
}