package leetcode;

public class issubquence {
	
	public static void main(String[] args) {
		 
		  String s ="abc"; 
		  String t = "ahbgdc";
		   int t_pointer =0;
		   int s_pointer =0;
		  
		  while(t_pointer<t.length()){
		    if(s.charAt(s_pointer)==t.charAt(t_pointer)){
		      s_pointer++;

		    }
		    if(s_pointer==s.length()){
		      System.out.println(true);
		    }
		    t_pointer++;


		  }}
}