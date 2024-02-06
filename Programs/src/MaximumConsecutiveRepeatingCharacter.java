import java.util.Arrays;

public class MaximumConsecutiveRepeatingCharacter{

     public static void main(String []args){
       String str = "aaaabbaaccde";
       int curr_count = 1;
       int count = 0;
       
       char res = str.charAt(0); 
       
       for(int i =0; i<str.length();i++){
           
           if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
              curr_count++; 
           } 
           else{
               if(curr_count>count){
                   count = curr_count;
                   res = str.charAt(i);
               }
               curr_count = 1;
           }
       }
       
       System.out.println(res);
       
}}
      
      
        
