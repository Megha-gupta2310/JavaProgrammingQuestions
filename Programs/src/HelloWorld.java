import java.util.HashMap;

public class HelloWorld
{
	public static void main(String[] args) {
	    
           int MAX_CHAR = 26;
           
           char[] pat = "obcd".toCharArray(); 
        char[] str = "bacc".toCharArray();
           
             int count[] = new int[MAX_CHAR];
           for(int i=0;i<str.length;i++){
               count[str[i]-'a']++;
           }
           
           int index = 0;
           for(int j= 0;j<pat.length;j++){
               for(int k=0;k<count[pat[j]-'a'];k++){
               str[index++] = pat[j];
           }}
           
           System.out.print(str);
           
             }
	} 
	

